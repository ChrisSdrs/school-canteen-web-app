package com.schoolcanteen.app.controller.property;

import com.schoolcanteen.app.forms.PropertyForm;
import com.schoolcanteen.app.model.PropertyModel;
import com.schoolcanteen.app.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import static com.schoolcanteen.app.utils.GlobalAttributes.ALERT_MESSAGE;
import static com.schoolcanteen.app.utils.GlobalAttributes.ALERT_TYPE;

@Controller
public class PropertyEditController {


    private static final String PROPERTY_FORM = "propertyForm";
    private static final String PROPERTY = "property";

    @Autowired
    private PropertyService propertyService;

    @PostMapping(value = "/admin/properties/{id}/edit")
    public String editProperty(@PathVariable Long id, Model model, RedirectAttributes redirectAttrs) {
        PropertyModel propertyModel = propertyService.findById(id).get();
        model.addAttribute(PROPERTY_FORM, new PropertyForm());
        model.addAttribute(PROPERTY, propertyModel);
        redirectAttrs.addFlashAttribute(ALERT_TYPE, "success");
        redirectAttrs.addFlashAttribute(ALERT_MESSAGE, "Property Edited successfully!");
        return "pages/property_edit";
    }

    @PostMapping(value = "/admin/properties/edit")
    public String editProperty(PropertyModel propertyModel) {
        propertyService.updateProperty(propertyModel);
        return "redirect:/admin/properties";
    }

    @PostMapping(value = "/admin/properties/{id}/delete")
    public String deleteProperty(@PathVariable Long id, RedirectAttributes redirectAttrs) {
        propertyService.deleteById(id);
        redirectAttrs.addFlashAttribute(ALERT_TYPE, "info");
        redirectAttrs.addFlashAttribute(ALERT_MESSAGE, "Property Deleted successfully!");
        return "redirect:/admin/properties";
    }
}
