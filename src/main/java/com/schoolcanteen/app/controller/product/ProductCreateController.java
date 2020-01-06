package com.schoolcanteen.app.controller.product;



import com.schoolcanteen.app.domain.Product;
import com.schoolcanteen.app.forms.ProductForm;
import com.schoolcanteen.app.mappers.ProductFormToProductMapper;
import com.schoolcanteen.app.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

import static javax.servlet.RequestDispatcher.ERROR_MESSAGE;

@Controller
public class ProductCreateController {
    private static final String PRODUCTS_FORM = "productForm";
    private static final String PRODUCT_CREATE_ERROR = "productCreateError";

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductFormToProductMapper mapper;

    @GetMapping(value = "/admin/products/create")
    public String createRepairs(Model model) {

        model.addAttribute(PRODUCTS_FORM, new ProductForm());
        return "pages/products_create";
    }

    @PostMapping(value = "/admin/products/create")
    public String createRepairs(Model model,
                                @Valid @ModelAttribute(PRODUCTS_FORM)
                                        ProductForm productForm,
                                BindingResult bindingResult, RedirectAttributes redirectAttrs) {

        if (bindingResult.hasErrors()) {
            //have some error handling here, perhaps add extra error messages to the model
            model.addAttribute(ERROR_MESSAGE, "an error occurred");
            return "pages/products_create";
        }
        Product product = mapper.toProduct(productForm);
        if (isValidProductEmptyFields(product)){
            productService.createProduct(product);
            return "redirect:/admin/products";
        }
        else {
            model.addAttribute(PRODUCTS_FORM, productForm);
            model.addAttribute(PRODUCT_CREATE_ERROR, "Please fill all fields!");
            return "pages/products_create";
        }
    }

    private boolean isValidProductEmptyFields(Product product){
        boolean isValid   = true;
        String productName = product.getProductName();
        Double productPrice = product.getProductPrice();
        if (productPrice == null || productName.isEmpty()){
            isValid = false;
        }

        return isValid;
    }
}
