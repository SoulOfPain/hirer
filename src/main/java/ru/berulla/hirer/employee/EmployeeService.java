package ru.berulla.hirer.employee;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
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

    public void deleteEmployee(Long id) {
        boolean exists = employeeRepository.existsById(id);
        if (!exists) {
            throw new IllegalStateException(String.format("the employee with id %s does not exists", id));
        }
        employeeRepository.deleteById(id);
    }

    @Transactional
    public void updateEmployee(Long employeeId, String name, String email) {
        EmployeeModel employee = employeeRepository.findById(employeeId).orElseThrow(() -> new IllegalStateException(
                String.format("the employee with id %s does not exists", employeeId)
        ));

        if (name != null && name.length() > 0 && !Objects.equals(employee.getName(), name)) {
            employee.setName(name);
        }

        if (email != null && email.length() > 0 && !Objects.equals(employee.getEmail(), email)) {
            Optional<EmployeeModel> employeeOptional = employeeRepository.findEmployeeModelByEmail(email);
            if (employeeOptional.isPresent()) {
                throw new IllegalStateException("the employee with the email is already exists");
            }
            employee.setEmail(email);
        }
    }
}
