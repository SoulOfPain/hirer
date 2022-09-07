package ru.berulla.hirer.employee;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;
    @GetMapping
    public List<EmployeeModel> getEmployees() {
        return employeeService.getEmployees();
    }

    @PostMapping
    public void registerEmployee(@RequestBody EmployeeModel employee) {
        employeeService.addNewEmployee(employee);
    }

}
