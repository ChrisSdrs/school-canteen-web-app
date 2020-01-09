package com.schoolcanteen.app.service;


import com.schoolcanteen.app.domain.Repair;
import com.schoolcanteen.app.mappers.RepairToRepairModelMapper;
import com.schoolcanteen.app.model.RepairModel;
import com.schoolcanteen.app.repository.RepairRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RepairServiceImpl implements RepairService {

    @Autowired
    private RepairRepository repairRepository;

    @Autowired
    private RepairToRepairModelMapper mapper;

    @Override
    public Repair createRepair(Repair repair) {
        return repairRepository.save(repair);
    }
    @Override
    public Repair updateRepair(RepairModel repairModel) {
        Repair originalRepair = repairRepository.findById(repairModel.getId()).get();
        originalRepair.setDate(repairModel.getDate());
        originalRepair.setCategory(repairModel.getCategory());
        originalRepair.setStatus(repairModel.getStatus());
        originalRepair.setType(repairModel.getType());
        originalRepair.setCost(repairModel.getCost());
        originalRepair.setAddress(repairModel.getAddress());
        originalRepair.setOwner(repairModel.getOwner());
        originalRepair.setDescription(repairModel.getDescription());

        return repairRepository.save(originalRepair);
    }

    @Override
    public void deleteById(Long id) {
        repairRepository.deleteById(id);
    }

    @Override
    public Optional<RepairModel> findById(Long id) {
        return repairRepository.findById(id)
                .map(repair -> mapper.mapToRepairModel(repair));
    }

    @Override
    public List<RepairModel> findAll() {
        return repairRepository.findAll()
                .stream()
                .map(repair -> mapper.mapToRepairModel(repair))
                .collect(Collectors.toList());
    }

    @Override
    public List<RepairModel> findByOwner(String owner) {
        return repairRepository.findByOwner(owner)
                .stream()
                .map(repair -> mapper.mapToRepairModel(repair))
                .collect(Collectors.toList());
    }

    @Override
    public List<RepairModel> findByType(String type) {
        return repairRepository.findByType(type)
                .stream()
                .map(repair -> mapper.mapToRepairModel(repair))
                .collect(Collectors.toList());
    }

    @Override
    public List<RepairModel> findByDateAfter(LocalDate dateAfter) {
        return repairRepository.findByDateAfter(dateAfter)
                .stream()
                .map(repair -> mapper.mapToRepairModel(repair))
                .collect(Collectors.toList());
    }

    @Override
    public List<RepairModel> findByDateBefore(LocalDate dateBefore) {
        return repairRepository.findByDateBefore(dateBefore)
                .stream()
                .map(repair -> mapper.mapToRepairModel(repair))
                .collect(Collectors.toList());
    }

    @Override
    public List<RepairModel> findByOwnerAndDateAfter(String owner, LocalDate dateAfter) {
        return repairRepository.findByOwnerAndDateAfter(owner, dateAfter)
                .stream()
                .map(repair -> mapper.mapToRepairModel(repair))
                .collect(Collectors.toList());
    }

    @Override
    public List<RepairModel> findByOwnerAndDateBefore(String owner, LocalDate dateBefore) {
        return repairRepository.findByOwnerAndDateBefore(owner, dateBefore)
                .stream()
                .map(repair -> mapper.mapToRepairModel(repair))
                .collect(Collectors.toList());
    }

    @Override
    public List<RepairModel> findByDateBetween(LocalDate dateBefore, LocalDate dateAfter) {
        return repairRepository.findByDateBetween(dateBefore, dateAfter)
                .stream()
                .map(repair -> mapper.mapToRepairModel(repair))
                .collect(Collectors.toList());
    }

    @Override
    public List<RepairModel> findByOwnerAndDateBetween(String owner, LocalDate dateBefore, LocalDate dateAfter) {
        return repairRepository.findByOwnerAndDateBetween(owner, dateBefore, dateAfter)
                .stream()
                .map(repair -> mapper.mapToRepairModel(repair))
                .collect(Collectors.toList());
    }

    @Override
    public List<RepairModel> findTop10ByDateOrderByDateAsc(LocalDate date) {
        return repairRepository.findTop10ByDateOrderByDateAsc(date)
                .stream()
                .map(repair -> mapper.mapToRepairModel(repair))
                .collect(Collectors.toList());
    }
}
