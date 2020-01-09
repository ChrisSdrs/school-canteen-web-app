package com.schoolcanteen.app.controller.property;


import com.schoolcanteen.app.domain.Property;
import com.schoolcanteen.app.forms.PropertyForm;
import com.schoolcanteen.app.mappers.PropertyFormToPropertyMapper;
import com.schoolcanteen.app.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;


import static com.schoolcanteen.app.utils.GlobalAttributes.ALERT_MESSAGE;
import static com.schoolcanteen.app.utils.GlobalAttributes.ALERT_TYPE;
import static javax.servlet.RequestDispatcher.ERROR_MESSAGE;

@Controller
public class PropertyCreateController {

    private static final String PROPERTY_FORM = "propertyForm";
    private static final String PROPERTY_CREATE_ERROR = "propertyCreateError" ;

    @Autowired
    private PropertyService propertyService;

    @Autowired
    private PropertyFormToPropertyMapper mapper;

    @GetMapping(value = "/admin/properties/create")
    public String createProperty(Model model) {

        model.addAttribute(PROPERTY_FORM, new PropertyForm());
        return "pages/property_create";
    }

    @PostMapping(value = "/admin/properties/create")
    public String createProperty(Model model,
                                 @Valid @ModelAttribute(PROPERTY_FORM)
                                         PropertyForm propertyForm,
                                 BindingResult bindingResult, RedirectAttributes redirectAttrs) {

        if (bindingResult.hasErrors()) {
            //have some error handling here, perhaps add extra error messages to the model
            model.addAttribute(ERROR_MESSAGE, "an error occurred");
            return "pages/property_create";
        }

        Property property = mapper.toProperty(propertyForm);
        if(isValidPropertyEmptyFields(property)) {
            if (isValidProperty(property) == "") {
                propertyService.createProperty(property);
                redirectAttrs.addFlashAttribute(ALERT_TYPE, "success");
                redirectAttrs.addFlashAttribute(ALERT_MESSAGE, "Property Created Successfully!");
                return "redirect:/admin/properties";
            }
            else {
                model.addAttribute(PROPERTY_CREATE_ERROR, isValidProperty(property));
                return "pages/property_create";
            }
        }else{
            model.addAttribute(PROPERTY_CREATE_ERROR, "Please fill all fields!");
            return "pages/property_create";
        }

    }


    private String isValidProperty(Property property) {
        String result = "";
        String pin = property.getPin();
        //Property provided is not Valid if pin already exists
        if (!propertyService.findByPin(pin).isEmpty()) {
            result += "Pin Already Exists. ";
        }
        return result;
    }


    private boolean isValidPropertyEmptyFields(Property property){
        boolean isValid   = true;
        String pin = property.getPin();
        String address = property.getAddress();
        int year = property.getYear();
        String type = property.getType();
        String owner = property.getOwner();
        if (pin.isEmpty() || address.isEmpty() || year == 0 || type.isEmpty() ||owner.isEmpty()){
            isValid = false;
        }
        return isValid;
    }


}
