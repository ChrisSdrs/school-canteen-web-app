package com.schoolcanteen.app.controller;


import com.schoolcanteen.app.model.PurchaseModel;
import com.schoolcanteen.app.model.RepairModel;
import com.schoolcanteen.app.model.ReportModel;
import com.schoolcanteen.app.model.UserModel;
import com.schoolcanteen.app.service.PurchaseService;
import com.schoolcanteen.app.service.RepairService;
import com.schoolcanteen.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class OwnerController {

    private static final String USER_DETAILS = "userDetails";
    private static final String USER_PROPERTIES = "userProperties";
    private static final String USER_REPAIRS = "userRepairs";
    private static final String REPORT_MODEL = "reportModel";

    @Autowired
    private UserService userService;

    @Autowired
    private PurchaseService purchaseService;

    @Autowired
    private RepairService repairService;

    @GetMapping(value = "/user")
    public String repairsToday(Model model) {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();

//        UserModel userDetails = userService.findByUsername(username).get();
//        String regn = userDetails.getRegn();
//        List<PurchaseModel> userProperties = purchaseService.findByRegn(regn);

//
//        List<RepairModel> userRepairs = repairService.findByOwner(regn);
//
//        int pendingRepairs = getStatusResult(userRepairs, "Pending");
//        int inProgressRepairs = getStatusResult(userRepairs, "In Progress");
//        int completedRepairs = getStatusResult(userRepairs, "Completed");
//        int totalRepairs = pendingRepairs + inProgressRepairs + completedRepairs;
//
//        if (totalRepairs != 0) {
//            double pending = ((double) pendingRepairs / (double)  totalRepairs) * 100;
//            double inProgress =  ((double) inProgressRepairs / (double) totalRepairs) * 100;
//            double completed = ( (double) completedRepairs / (double)  totalRepairs) * 100;
//
//            ReportModel reportModel = new ReportModel();
//            reportModel.setPendingRepairs(pending);
//            reportModel.setInProgressRepairs(inProgress);
//            reportModel.setCompletedRepairs(completed);
//            model.addAttribute(REPORT_MODEL, reportModel);
//        }
//
//
//
//        model.addAttribute(USER_DETAILS, userDetails);
//        model.addAttribute(USER_PROPERTIES, userProperties);
//        model.addAttribute(USER_REPAIRS, userRepairs);

        return "pages/owner";
    }

    private int getStatusResult(List<RepairModel> userRepairs, String statusGiven){
        int result = 0;
        String status;
        RepairModel currentRepairModel;
        for( int i=0; i<userRepairs.size(); i++ ) {
            currentRepairModel = (userRepairs.get(i));
            status = currentRepairModel.getStatus();
            if (status.matches(statusGiven)) {
                result += 1;
            }
        }
        return result;
    }

}
