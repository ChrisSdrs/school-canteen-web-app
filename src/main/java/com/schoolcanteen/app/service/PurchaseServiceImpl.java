package com.schoolcanteen.app.service;


import com.schoolcanteen.app.domain.Purchase;
import com.schoolcanteen.app.mappers.PropertyToPropertyModelMapper;
import com.schoolcanteen.app.model.PurchaseModel;
import com.schoolcanteen.app.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PurchaseServiceImpl implements PurchaseService {

    @Autowired
    private PurchaseRepository purchaseRepository;

    @Autowired
    private PropertyToPropertyModelMapper mapper;


    @Override
    public List<PurchaseModel> findAll() {
        return purchaseRepository.findAll()
                .stream()
                .map(property -> mapper.mapToPropertyModel(property))
                .collect(Collectors.toList());
    }

    @Override
    public Purchase createProperty(Purchase purchase) {
        return purchaseRepository.save(purchase);
    }

    @Override
    public Optional<PurchaseModel> findById(Long id) {
        return purchaseRepository.findById(id)
                .map(property -> mapper.mapToPropertyModel(property));
    }

    @Override
    public Purchase updateProperty(PurchaseModel purchaseModel){
        Purchase originalPurchase = purchaseRepository.findById(purchaseModel.getId()).get();
        originalPurchase.setDescription(purchaseModel.getDescription());
        originalPurchase.setRegn(purchaseModel.getRegn());
        originalPurchase.setCost(purchaseModel.getCost());
        return purchaseRepository.save(originalPurchase);
    }

    @Override
    public void deleteById(Long id) {
        purchaseRepository.deleteById(id);
    }

    @Override
    public List<PurchaseModel> findByRegn(String owner) {
        return purchaseRepository.findByRegn(owner)
                .stream()
                .map(property -> mapper.mapToPropertyModel(property))
                .collect(Collectors.toList());
    }



}
