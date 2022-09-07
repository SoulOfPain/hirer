package ru.berulla.hirer.employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeModel, Long> {

    @Query("SELECT e FROM EmployeeModel e WHERE e.email = ?1")
    Optional<EmployeeModel> findEmployeeModelByEmail(String email);

}
