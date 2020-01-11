package com.schoolcanteen.app.service;


import com.schoolcanteen.app.domain.Purchase;
import com.schoolcanteen.app.model.PurchaseModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface PurchaseService {

    List<PurchaseModel> findAll();

    Purchase createProperty(Purchase purchase);

    Optional<PurchaseModel> findById(Long id);

    Purchase updateProperty(PurchaseModel purchaseModel);

    void deleteById(Long id);

    List<PurchaseModel> findByRegn(String regn);

}
