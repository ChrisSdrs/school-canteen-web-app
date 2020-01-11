package com.schoolcanteen.app.controller.property;

import com.schoolcanteen.app.forms.PurchaseForm;
import com.schoolcanteen.app.model.PurchaseModel;
import com.schoolcanteen.app.service.PurchaseService;
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
    private PurchaseService purchaseService;

    @PostMapping(value = "/admin/properties/{id}/edit")
    public String editProperty(@PathVariable Long id, Model model, RedirectAttributes redirectAttrs) {
        PurchaseModel purchaseModel = purchaseService.findById(id).get();
        model.addAttribute(PROPERTY_FORM, new PurchaseForm());
        model.addAttribute(PROPERTY, purchaseModel);
        redirectAttrs.addFlashAttribute(ALERT_TYPE, "success");
        redirectAttrs.addFlashAttribute(ALERT_MESSAGE, "Purchases Edited successfully!");
        return "pages/property_edit";
    }

    @PostMapping(value = "/admin/properties/edit")
    public String editProperty(PurchaseModel purchaseModel) {
        purchaseService.updateProperty(purchaseModel);
        return "redirect:/admin/properties";
    }

    @PostMapping(value = "/admin/properties/{id}/delete")
    public String deleteProperty(@PathVariable Long id, RedirectAttributes redirectAttrs) {
        purchaseService.deleteById(id);
        redirectAttrs.addFlashAttribute(ALERT_TYPE, "info");
        redirectAttrs.addFlashAttribute(ALERT_MESSAGE, "Purchases Deleted successfully!");
        return "redirect:/admin/properties";
    }
}
