package com.schoolcanteen.app.repository;

import com.schoolcanteen.app.domain.Repair;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface RepairRepository extends JpaRepository<Repair, Long> {

    Repair save(Repair repair);

    void deleteById(long id);

    Optional<Repair> findById(Long id);

    List<Repair> findAll();

    List<Repair> findByOwner(String owner);

    List<Repair> findByType(String type);

    List<Repair> findByDateAfter(LocalDate dateAfter);

    List<Repair> findByDateBefore(LocalDate dateBefore);

    List<Repair> findByOwnerAndDateAfter(String owner, LocalDate dateAfter);

    List<Repair> findByOwnerAndDateBefore(String owner, LocalDate dateBefore);

    List<Repair> findByDateBetween(LocalDate dateBefore, LocalDate dateAfter);

    List<Repair> findByOwnerAndDateBetween(String owner, LocalDate dateBefore, LocalDate dateAfter);

    List<Repair> findTop10ByDateOrderByDateAsc(LocalDate date);


}
