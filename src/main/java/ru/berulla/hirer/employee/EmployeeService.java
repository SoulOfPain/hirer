package ru.berulla.hirer.employee;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    public List<EmployeeModel> getEmployees() {
        return employeeRepository.findAll();
    }

    public void addNewEmployee(EmployeeModel employee) {
        Optional<EmployeeModel> employeeByEmail = employeeRepository.findEmployeeModelByEmail(employee.getEmail());
        if (employeeByEmail.isPresent()) {
            throw new IllegalStateException("the employee with the email is already exists");
        }
        employeeRepository.save(employee);
    }
}
