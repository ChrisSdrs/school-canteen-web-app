package com.schoolcanteen.app.mappers;

import com.schoolcanteen.app.domain.Repair;
import com.schoolcanteen.app.forms.RepairForm;
import org.springframework.stereotype.Component;

@Component
public class RepairFormToRepairMapper {

    public Repair mapToRepairModel(RepairForm repairForm) {
        Repair repair = new Repair();
        repair.setId(repairForm.getId());
        repair.setDate(repairForm.getDate());
        repair.setStatus(repairForm.getStatus());
        repair.setCategory(repairForm.getCategory());
        repair.setType(repairForm.getType());
        repair.setCost(repairForm.getCost());
        repair.setAddress(repairForm.getAddress());
        repair.setOwner(repairForm.getOwner());
        repair.setDescription(repairForm.getDescription());
        return repair;

    }
}
