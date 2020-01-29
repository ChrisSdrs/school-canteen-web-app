package com.schoolcanteen.app.controller.product;

import com.schoolcanteen.app.model.ProductModel;
import com.schoolcanteen.app.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {

    private static final String PRODUCT_LIST = "products";

    @Autowired
    private ProductService productService;


    @GetMapping(value = "/admin/products")
    public String products(Model model) {
        List<ProductModel> products = productService.findAll();
        model.addAttribute(PRODUCT_LIST, products);
        return "pages/products_show";
    }
}
