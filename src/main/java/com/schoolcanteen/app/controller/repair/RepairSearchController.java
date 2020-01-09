package com.schoolcanteen.app.controller.repair;


import com.schoolcanteen.app.forms.RepairSearchForm;
import com.schoolcanteen.app.mappers.RepairFormToRepairMapper;
import com.schoolcanteen.app.model.RepairModel;
import com.schoolcanteen.app.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;

import static javax.servlet.RequestDispatcher.ERROR_MESSAGE;

@Controller
public class RepairSearchController {
    private static final String SEARCH_REPAIRS_FORM = "searchRepairForm";
    private static final String REPAIR_LIST = "repairs";

    @Autowired
    private RepairService repairService;

    @Autowired
    private RepairFormToRepairMapper mapper;

    @GetMapping(value = "/admin/repairs/search")
    public String searchRepairs(Model model) {
        model.addAttribute(SEARCH_REPAIRS_FORM, new RepairSearchForm());
        return "pages/repairs_search";
    }

    @PostMapping(value = "/admin/repairs/search")
    public String searchRepairs(Model model,
                                @Valid @ModelAttribute(SEARCH_REPAIRS_FORM)
                                        RepairSearchForm repairSearchForm,
                                BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            //have some error handling here, perhaps add extra error messages to the model
            model.addAttribute(ERROR_MESSAGE, "an error occurred");
            return "pages/repairs_search";
        }
        String ssn = repairSearchForm.getSsn();
        LocalDate dateFrom = repairSearchForm.getDateFrom();
        LocalDate dateTo = repairSearchForm.getDateTo();

        List<RepairModel> repairs = getRepairsFromSearch(ssn,dateFrom,dateTo);
        model.addAttribute(REPAIR_LIST, repairs);
        model.addAttribute(SEARCH_REPAIRS_FORM, repairSearchForm);
        return "pages/repairs_search_results";
    }

    private List<RepairModel> getRepairsFromSearch(String ssn, LocalDate dateFrom, LocalDate dateTo){
        if (ssn == ""){
            if (dateFrom == null){
                if (dateTo == null){
                    return repairService.findAll();
                }
                else{
                    return repairService.findByDateBefore(dateTo);
                }
            }
            else{
                if (dateTo == null){
                    return repairService.findByDateAfter(dateFrom);
                }
                else{
                    return repairService.findByDateBetween(dateFrom, dateTo);
                }
            }
        }
        else{
            if (dateFrom == null){
                if (dateTo == null){
                    return repairService.findByOwner(ssn);
                }
                else{
                    return repairService.findByOwnerAndDateBefore(ssn, dateTo);
                }
            }
            else{
                if (dateTo == null){
                    return repairService.findByOwnerAndDateAfter(ssn, dateFrom);
                }
                else{
                    return repairService.findByOwnerAndDateBetween(ssn, dateFrom, dateTo);
                }
            }
        }

    }

}
