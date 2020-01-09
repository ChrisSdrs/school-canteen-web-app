package com.schoolcanteen.app.service;


import com.schoolcanteen.app.domain.Property;
import com.schoolcanteen.app.mappers.PropertyToPropertyModelMapper;
import com.schoolcanteen.app.model.PropertyModel;
import com.schoolcanteen.app.repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PropertyServiceImpl implements PropertyService {

    @Autowired
    private PropertyRepository propertyRepository;

    @Autowired
    private PropertyToPropertyModelMapper mapper;


    @Override
    public List<PropertyModel> findAll() {
        return propertyRepository.findAll()
                .stream()
                .map(property -> mapper.mapToPropertyModel(property))
                .collect(Collectors.toList());
    }

    @Override
    public Property createProperty(Property property) {
        return propertyRepository.save(property);
    }

    @Override
    public Optional<PropertyModel> findById(Long id) {
        return propertyRepository.findById(id)
                .map(property -> mapper.mapToPropertyModel(property));
    }

    @Override
    public Property updateProperty(PropertyModel propertyModel){
        Property originalProperty = propertyRepository.findById(propertyModel.getId()).get();
        originalProperty.setPin(propertyModel.getPin());
        originalProperty.setAddress(propertyModel.getAddress());
        originalProperty.setYear(propertyModel.getYear());
        originalProperty.setType(propertyModel.getType());
        originalProperty.setOwner(propertyModel.getOwner());
        return propertyRepository.save(originalProperty);
    }

    @Override
    public void deleteById(Long id) {
        propertyRepository.deleteById(id);
    }

    @Override
    public List<PropertyModel> findByPin(String pin) {
        return propertyRepository.findByPin(pin)
                .stream()
                .map(property -> mapper.mapToPropertyModel(property))
                .collect(Collectors.toList());
    }

    @Override
    public List<PropertyModel> findByOwner(String owner) {
        return propertyRepository.findByOwner(owner)
                .stream()
                .map(property -> mapper.mapToPropertyModel(property))
                .collect(Collectors.toList());
    }

    @Override
    public List<PropertyModel> findByPinAndOwner(String pin, String owner) {
        return propertyRepository.findByPinAndOwner(pin, owner)
                .stream()
                .map(property -> mapper.mapToPropertyModel(property))
                .collect(Collectors.toList());
    }


}
