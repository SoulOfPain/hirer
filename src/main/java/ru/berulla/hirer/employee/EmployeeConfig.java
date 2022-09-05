package ru.berulla.hirer.employee;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class EmployeeConfig {

    @Bean
    CommandLineRunner commandLineRunner(EmployeeRepository repository) {
        return args -> {
            EmployeeModel cris = new EmployeeModel(
                    "Cris",
                    "first@mail.com",
                    LocalDate.now(),
                    21,
                    1
            );

            EmployeeModel dave = new EmployeeModel(
                    "Dave",
                    "first@mail.com",
                    LocalDate.of(2000, 3, 28),
                    22,
                    1
            );

            repository.saveAll(
                    List.of(cris, dave)
            );
        };
    }

}
