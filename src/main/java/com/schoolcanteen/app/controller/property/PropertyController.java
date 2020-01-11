package com.schoolcanteen.app.controller.property;

import com.schoolcanteen.app.model.PurchaseModel;
import com.schoolcanteen.app.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PropertyController {

    private static final String PROPERTY_LIST = "properties";

    @Autowired
    private PurchaseService purchaseService;


//    @GetMapping(value = "/admin/properties")
//    public String properties(Model model) {
//        List<PurchaseModel> properties = purchaseService.findAll();
//        model.addAttribute(PROPERTY_LIST, properties);
//        return "pages/properties_show";
//    }
}
