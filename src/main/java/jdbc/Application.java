package jdbc;

import jdbc.dao.EmployeeDAOImplEM;
import jdbc.dao.EmployeeDAOImplSession;
import jdbc.model.Employee;

public class Application {
    public static void main(String[] args) {
        EmployeeDAOImplEM employeeDAOImplEM1 = new EmployeeDAOImplEM();
        EmployeeDAOImplSession employeeDAOImplSession1 = new EmployeeDAOImplSession();

        System.out.println("\nСоздание (добавление) сущности Employee в таблицу.");
        Employee employee11 = new Employee("Имя1","Фамилия1",22,"муж.",2);
        Employee employee12 = new Employee("Имя122","Фамилия122",22,"муж.",2);
        employeeDAOImplEM1.add(employee11);
        employeeDAOImplSession1.add(employee12);

        System.out.println("\nПолучение конкретного объекта Employee по id.");
        Employee employee21 = employeeDAOImplEM1.findById(4);
        Employee employee22 = employeeDAOImplSession1.findById(6);
        System.out.println(employee21);
        System.out.println(employee22);

        System.out.println("\nПолучение списка всех объектов Employee из базы.");
        System.out.println(employeeDAOImplEM1.getAllEmployee());
        System.out.println(employeeDAOImplSession1.getAllEmployee());

        System.out.println("\nИзменение конкретного объекта Employee в базе по id.");
        Employee employee31 = new Employee("Имя331","Фамилия33",32,"муж.",3);
        Employee employee32 = new Employee("Имя3","Фамилия334",32,"муж.",3);
        employeeDAOImplEM1.changeById(10, employee31);
        System.out.println(employeeDAOImplEM1.findById(10));
        employeeDAOImplSession1.changeById(33, employee32);
        System.out.println(employeeDAOImplSession1.findById(14));

        System.out.println("\nУдаление конкретного объекта Employee из базы по id.");
        employeeDAOImplEM1.delete(17);
        employeeDAOImplSession1.delete(19);

        System.out.println("\nУдаление конкретного объекта Employee из базы.");
        Employee employee41 = new Employee(21,"Имя1","Фамилия1",22,"муж.",1);
        Employee employee42 = new Employee(26,"Имя1","Фамилия1",22,"муж.",1);
        employeeDAOImplEM1.delete(employee41);
        employeeDAOImplSession1.delete(employee42);
    }
}