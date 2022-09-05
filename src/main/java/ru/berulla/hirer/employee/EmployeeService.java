package ru.berulla.hirer.employee;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    public List<EmployeeModel> getEmployees() {
        return employeeRepository.findAll();
    }

}
