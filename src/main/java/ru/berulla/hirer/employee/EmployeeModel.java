package ru.berulla.hirer.employee;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Setter
@Getter
@Entity
@Table
public class EmployeeModel {
    @Id
    @SequenceGenerator(
            name = "employee_sequence",
            sequenceName = "employee_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "employee_sequence"
    )
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
