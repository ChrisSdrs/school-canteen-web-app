package com.schoolcanteen.app.controller.property;


import com.schoolcanteen.app.forms.PropertySearchForm;
import com.schoolcanteen.app.mappers.PropertyFormToPropertyMapper;
import com.schoolcanteen.app.model.PurchaseModel;
import com.schoolcanteen.app.service.PurchaseService;
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
public class PropertySearchController {

    private static final String PROPERTY_SEARCH_FORM = "propertySearchForm";
    private static final String PROPERTIES = "properties";

    @Autowired
    private PurchaseService purchaseService;

    @Autowired
    private PropertyFormToPropertyMapper mapper;

    @GetMapping(value = "/admin/properties/search")
    public String searchProperties(Model model) {
        model.addAttribute(PROPERTY_SEARCH_FORM, new PropertySearchForm());
        return "pages/properties_search";
    }

    @PostMapping(value = "/admin/properties/search")
    public String searchUsers(Model model,
                              @Valid @ModelAttribute(PROPERTY_SEARCH_FORM)
                                      PropertySearchForm propertySearchForm,
                              BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            //have some error handling here, perhaps add extra error messages to the model
            model.addAttribute(ERROR_MESSAGE, "an error occurred");
            return "pages/properties_search";
        }


        List<PurchaseModel> properties = purchaseService.findAll();
        model.addAttribute(PROPERTIES, properties);
        model.addAttribute(PROPERTY_SEARCH_FORM, propertySearchForm);
        return "pages/properties_search_results";


    }

}
