package ru.berulla.hirer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.berulla.hirer.employee.EmployeeModel;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class HirerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HirerApplication.class, args);
    }

}
