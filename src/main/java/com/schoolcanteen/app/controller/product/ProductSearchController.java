package com.schoolcanteen.app.controller.product;

import com.schoolcanteen.app.forms.ProductSearchForm;
import com.schoolcanteen.app.mappers.ProductFormToProductMapper;
import com.schoolcanteen.app.model.ProductModel;
import com.schoolcanteen.app.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

import static javax.servlet.RequestDispatcher.ERROR_MESSAGE;

@Controller
public class ProductSearchController {

    private static final String PRODUCT_SEARCH_FORM = "productSearchForm";
    private static final String PRODUCTS = "products";

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductFormToProductMapper mapper;

    @GetMapping(value = "/admin/products/search")
    public String searchProducts(Model model) {
        model.addAttribute(PRODUCT_SEARCH_FORM, new ProductSearchForm());
        return "pages/products_search";
    }

    @PostMapping(value = "/admin/products/search")
    public String searchProducts(Model model,
                              @Valid @ModelAttribute(PRODUCT_SEARCH_FORM)
                                      ProductSearchForm productSearchForm,
                              BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            //have some error handling here, perhaps add extra error messages to the model
            model.addAttribute(ERROR_MESSAGE, "an error occurred");
            return "pages/products_search";
        }
        String productSerialNumber = productSearchForm.getProductSerialNumber();
        String productName = productSearchForm.getProductName();


        List<ProductModel> products = getProductsFromSearch(productSerialNumber, productName);
        model.addAttribute(PRODUCTS, products);
        model.addAttribute(PRODUCT_SEARCH_FORM, productSearchForm);
        return "pages/products_search_results";
    }

    private List<ProductModel> getProductsFromSearch(String productSerialNumber, String productName){
        if (productSerialNumber == ""){
            if (productName == ""){
                return productService.findAll();
            }
            else{
                return productService.findByProductName(productName);
            }
        }
        else{
            if (productName == ""){
                return productService.findByProductSerialNumber(productSerialNumber);
            }
            else{
                return productService.findByProductSerialNumberAndProductName(productSerialNumber,productName);
            }
        }
    }

}
