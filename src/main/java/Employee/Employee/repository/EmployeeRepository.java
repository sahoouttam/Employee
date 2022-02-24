package Employee.Employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Employee.Employee.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}
