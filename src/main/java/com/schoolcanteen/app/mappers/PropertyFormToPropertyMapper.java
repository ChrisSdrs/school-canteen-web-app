package com.schoolcanteen.app.mappers;

import com.schoolcanteen.app.domain.Purchase;
import com.schoolcanteen.app.forms.PurchaseForm;
import org.springframework.stereotype.Component;

@Component
public class PropertyFormToPropertyMapper {

    public Purchase toProperty(PurchaseForm purchaseForm){
        Purchase purchase = new Purchase();
        purchase.setCost(purchaseForm.getCost());
        purchase.setDescription(purchaseForm.getDescription());
        purchase.setRegn(purchaseForm.getRegn());

        return purchase;
    }

}
