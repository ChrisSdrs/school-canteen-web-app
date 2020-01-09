package com.schoolcanteen.app.controller.repair;


import com.schoolcanteen.app.domain.Repair;
import com.schoolcanteen.app.forms.RepairForm;
import com.schoolcanteen.app.mappers.RepairFormToRepairMapper;
import com.schoolcanteen.app.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.time.LocalDate;


import static com.schoolcanteen.app.utils.GlobalAttributes.ALERT_MESSAGE;
import static com.schoolcanteen.app.utils.GlobalAttributes.ALERT_TYPE;
import static javax.servlet.RequestDispatcher.ERROR_MESSAGE;

@Controller
public class RepairCreateController {
    private static final String REPAIRS_FORM = "repairForm";
    private static final String REPAIR_CREATE_ERROR = "repairCreateError";

    @Autowired
    private RepairService repairService;

    @Autowired
    private RepairFormToRepairMapper mapper;

    @GetMapping(value = "/admin/repairs/create")
    public String createRepairs(Model model) {

        model.addAttribute(REPAIRS_FORM, new RepairForm());
        return "pages/repairs_create";
    }

    @PostMapping(value = "/admin/repairs/create")
    public String createRepairs(Model model,
                                @Valid @ModelAttribute(REPAIRS_FORM)
                  RepairForm repairForm,
                                BindingResult bindingResult, RedirectAttributes redirectAttrs) {

        if (bindingResult.hasErrors()) {
            //have some error handling here, perhaps add extra error messages to the model
            model.addAttribute(ERROR_MESSAGE, "an error occurred");
            return "pages/repairs_create";
        }
        Repair repair = mapper.mapToRepairModel(repairForm);
        if (isValidRepairEmptyFields(repair)){
            repairService.createRepair(repair);
            redirectAttrs.addFlashAttribute(ALERT_TYPE, "success");
            redirectAttrs.addFlashAttribute(ALERT_MESSAGE, "Repair Created Successfully!");
            return "redirect:/admin/repairs";
        }
        else {
            model.addAttribute(REPAIRS_FORM, repairForm);
            model.addAttribute(REPAIR_CREATE_ERROR, "Please fill all fields!");
            return "pages/repairs_create";
        }
    }

    private boolean isValidRepairEmptyFields(Repair repair){
        boolean isValid   = true;
        LocalDate date = repair.getDate();
        String status = repair.getStatus();
        String type = repair.getType();
        double cost = repair.getCost();
        String address = repair.getAddress();
        String owner = repair.getOwner();
        if (date == null || status.isEmpty() || type.isEmpty() || cost == 0.0  || address.isEmpty() || owner.isEmpty() ){
            isValid = false;
        }

        return isValid;
    }

}
