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

    private static final String PRODUCT_FORM = "productForm";
    private static final String PRODUCT_CREATE_ERROR = "productCreateError" ;

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductFormToProductMapper mapper;

    @GetMapping(value = "/admin/products/create")
    public String createProduct(Model model) {

        model.addAttribute(PRODUCT_FORM, new ProductForm());
        return "pages/product_create";
    }

    @PostMapping(value = "/admin/products/create")
    public String createProduct(Model model,
                             @Valid @ModelAttribute(PRODUCT_FORM)
                                     ProductForm productForm,
                             BindingResult bindingResult, RedirectAttributes redirectAttrs) {

        if (bindingResult.hasErrors()) {
            //have some error handling here, perhaps add extra error messages to the model
            model.addAttribute(ERROR_MESSAGE, "an error occurred");
            return "pages/product_create";
        }

        Product product = mapper.toProduct(productForm);
        if(isValidProductEmptyFields(product)) {
            if (isValidProduct(product) == "") {
                productService.createProduct(product);
                return "redirect:/admin/products";
            }
            else {
                model.addAttribute(PRODUCT_CREATE_ERROR, isValidProduct(product));
                return "pages/product_create";
            }
        }else{
            model.addAttribute(PRODUCT_CREATE_ERROR, "Please fill all fields!");
            return "pages/product_create";
        }

    }


    private String isValidProduct(Product product) {
        String result = "";
        String productSerialNumber = product.getProductSerialNumber();
        //Product provided is not Valid if pin already exists
        if (!productService.findByProductSerialNumber(productSerialNumber).isEmpty()) {
            result += "Serial Number Already Exists. ";
        }
        return result;
    }


    private boolean isValidProductEmptyFields(Product product){
        boolean isValid   = true;
        String productSerialNumber = product.getProductSerialNumber();
        String price = product.getPrice();
        String productName = product.getProductName();
        if (productSerialNumber.isEmpty() || price.isEmpty()  || productName.isEmpty()){
            isValid = false;
        }
        return isValid;
    }


}
