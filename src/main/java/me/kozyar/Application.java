package me.kozyar;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        Employee employee1 = new Employee("Inna", "Rapaport", "female", 47, 1);
        employeeDAO.create(employee1);
        System.out.println(employeeDAO.readById(1));
        List<Employee> list = employeeDAO.readAll();
        for (Employee employee : list) {
            System.out.println(employee);
        }
        Employee employee2 = new Employee("Oxana", "Kozyar", "female", 40, 2);
        employeeDAO.create(employee2);
        employeeDAO.updateEmployee(employee1);
        employeeDAO.delete(employee2);
    }
}
