package jdbc.dao;

import jdbc.model.Employee;

import java.util.List;

public interface EmployeeDAO {
    void add(Employee employee);
    Employee findById(long id);
    List<Employee> getAllEmployee();
    void changeById(long id, Employee employee);
    void delete(long id);
    void delete(Employee employee);
}
