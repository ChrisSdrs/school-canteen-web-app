package com.schoolcanteen.app.mappers;

import com.schoolcanteen.app.domain.Repair;
import com.schoolcanteen.app.model.RepairModel;
import org.springframework.stereotype.Component;

@Component
public class RepairToRepairModelMapper {

    public RepairModel mapToRepairModel(Repair repair) {
        RepairModel repairModel = new RepairModel();
        repairModel.setId(repair.getId());
        repairModel.setDate(repair.getDate());
        repairModel.setStatus(repair.getStatus());
        repairModel.setCategory(repair.getCategory());
        repairModel.setType(repair.getType());
        repairModel.setCost(repair.getCost());
        repairModel.setAddress(repair.getAddress());
        repairModel.setOwner(repair.getOwner());
        repairModel.setDescription(repair.getDescription());
        return repairModel;
    }
}
