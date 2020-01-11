package com.schoolcanteen.app.mappers;

import com.schoolcanteen.app.domain.Purchase;
import com.schoolcanteen.app.model.PurchaseModel;
import org.springframework.stereotype.Component;

@Component
public class PropertyToPropertyModelMapper {

    public PurchaseModel mapToPropertyModel(Purchase purchase) {
       PurchaseModel purchaseModel = new PurchaseModel();
       purchaseModel.setId(purchase.getId());
       purchaseModel.setCost(purchase.getCost());
       purchaseModel.setDescription(purchase.getDescription());
       purchaseModel.setRegn(purchase.getRegn());

       return purchaseModel;
    }
}
