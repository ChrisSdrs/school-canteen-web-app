package com.schoolcanteen.app.controller.property;


import com.schoolcanteen.app.domain.Purchase;
import com.schoolcanteen.app.forms.PurchaseForm;
import com.schoolcanteen.app.mappers.PropertyFormToPropertyMapper;
import com.schoolcanteen.app.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class PropertyCreateController {

    private static final String PURCHASE_FORM = "propertyForm";
    private static final String PROPERTY_CREATE_ERROR = "propertyCreateError" ;

    @Autowired
    private PurchaseService purchaseService;

    @Autowired
    private PropertyFormToPropertyMapper mapper;

//    @GetMapping(value = "/admin/properties/create")
//    public String createProperty(Model model) {
//
//        model.addAttribute(PURCHASE_FORM, new PurchaseForm());
//        return "pages/property_create";
//    }

//    @PostMapping(value = "/admin/properties/create")
//    public String createProperty(Model model,
//                                 @Valid @ModelAttribute(PURCHASE_FORM) PurchaseForm purchaseForm) {
//
//        Purchase purchase = mapper.toProperty(purchaseForm);
//        purchaseService.createProperty(purchase);
//
//        return "redirect:/admin/properties";
//
//
//
//    }




}
