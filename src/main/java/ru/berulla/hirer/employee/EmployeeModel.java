package ru.berulla.hirer.employee;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class EmployeeModel {
    private Long id;
    private String name;
    private String email;
    private LocalDate dateOfBirth;
    private Integer age;
    private Integer experience;

    public EmployeeModel(String name, String email, LocalDate dateOfBirth, Integer age, Integer experience) {
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.experience = experience;
    }

    public EmployeeModel(Long id, String name, String email, LocalDate dateOfBirth, Integer age, Integer experience) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.experience = experience;
    }

    public EmployeeModel() {
    }
}
