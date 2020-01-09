package com.schoolcanteen.app.service;

import com.schoolcanteen.app.domain.Repair;
import com.schoolcanteen.app.model.RepairModel;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public interface RepairService {

    Repair createRepair(Repair repair);

    Repair updateRepair(RepairModel repairModel);

    void deleteById(Long id);

    Optional<RepairModel> findById(Long id);

    List<RepairModel> findAll();

    List<RepairModel> findByOwner(String owner);

    List<RepairModel> findByType(String type);

    List<RepairModel> findByDateAfter(LocalDate date);

    List<RepairModel> findByDateBefore(LocalDate date);

    List<RepairModel> findByOwnerAndDateAfter(String owner, LocalDate dateAfter);

    List<RepairModel> findByOwnerAndDateBefore(String owner, LocalDate dateBefore);

    List<RepairModel> findByDateBetween(LocalDate dateBefore, LocalDate dateAfter);

    List<RepairModel> findByOwnerAndDateBetween(String owner, LocalDate dateBefore, LocalDate dateAfter);

    List<RepairModel> findTop10ByDateOrderByDateAsc(LocalDate dateBefore);
}
