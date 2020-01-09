package com.schoolcanteen.app.controller.repair;


import com.schoolcanteen.app.forms.RepairForm;
import com.schoolcanteen.app.model.RepairModel;
import com.schoolcanteen.app.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import static com.schoolcanteen.app.utils.GlobalAttributes.ALERT_MESSAGE;
import static com.schoolcanteen.app.utils.GlobalAttributes.ALERT_TYPE;

@Controller
public class RepairEditController {

    private static final String REPAIR_FORM = "repairForm";
    private static final String REPAIR= "repair";

    @Autowired
    private RepairService repairService;


    @PostMapping(value = "/admin/repairs/{id}/delete")
    public String deleteRepair(@PathVariable Long id, RedirectAttributes redirectAttrs) {
        repairService.deleteById(id);
        redirectAttrs.addFlashAttribute(ALERT_TYPE, "info");
        redirectAttrs.addFlashAttribute(ALERT_MESSAGE, "Repair Deleted Successfully!");
        return "redirect:/admin/repairs";
    }

    @PostMapping(value = "/admin/repairs/{id}/edit")
    public String editRepair(@PathVariable Long id, Model model) {
        RepairModel repairModel = repairService.findById(id).get();
        model.addAttribute(REPAIR_FORM, new RepairForm());
        model.addAttribute(REPAIR, repairModel);
        return "pages/repair_edit";
    }

    @PostMapping(value = "/admin/repairs/edit")
    public String editRepair(RepairModel repairModel, RedirectAttributes redirectAttrs) {
        repairService.updateRepair(repairModel);
        redirectAttrs.addFlashAttribute(ALERT_TYPE, "success");
        redirectAttrs.addFlashAttribute(ALERT_MESSAGE, "Repair Edited successfully!");
        return "redirect:/admin/repairs";
    }
}
