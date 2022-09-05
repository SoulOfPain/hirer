package ru.berulla.hirer.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("api")
public class EmployeeController {

    @GetMapping
    public List<EmployeeModel> getEmployees() {
        return List.of(
                new EmployeeModel(
                        1L,
                        "Markul",
                        "first@mail.com",
                        LocalDate.now(),
                        21,
                        1
                )
        );
    }

}
