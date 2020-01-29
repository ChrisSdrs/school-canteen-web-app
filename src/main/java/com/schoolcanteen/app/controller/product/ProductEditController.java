package com.schoolcanteen.app.controller.product;

import com.schoolcanteen.app.forms.ProductForm;
import com.schoolcanteen.app.model.ProductModel;
import com.schoolcanteen.app.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ProductEditController {


    private static final String PRODUCT_FORM = "productForm";
    private static final String PRODUCT = "product";

    @Autowired
    private ProductService productService;

    @PostMapping(value = "/admin/products/{id}/edit")
    public String editProduct(@PathVariable Long id, Model model) {
        ProductModel productModel = productService.findById(id).get();
        model.addAttribute(PRODUCT_FORM, new ProductForm());
        model.addAttribute(PRODUCT, productModel);
        return "pages/product_edit";
    }

    @PostMapping(value = "/admin/products/edit")
    public String editProduct(ProductModel productModel) {
        productService.updateProduct(productModel);
        return "redirect:/admin/products";
    }

    @PostMapping(value = "/admin/products/{id}/delete")
    public String deleteProduct(@PathVariable Long id) {
        productService.deleteById(id);
        return "redirect:/admin/products";
    }
}
