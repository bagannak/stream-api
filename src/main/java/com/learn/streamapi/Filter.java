package com.learn.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

record Employee(String name, double salary, Employee manager) {

    //compact canonical constructor
    public Employee
    {
        if(name == null )
            throw new IllegalArgumentException("name can't be null");
    }
}

public class Filter {
    public static void main(String[] args) {
        List<Employee> employees = new Filter().getEmployees();

        // Find employees earning more than their managers
        List<Employee> highEarners = employees.stream()
                .filter(employee -> employee.manager() != null && employee.salary() > employee.manager().salary())
                .collect(Collectors.toList());
        // Print the result
        System.out.println("Employees earning more than their managers:");
        highEarners.forEach(employee -> System.out.println(employee.name() + " earns more than " + employee.manager().name()));
    }

    private List<Employee> getEmployees() {
        // Create employees
        Employee manager = new Employee("Manager", 50000, null);
        Employee emp1 = new Employee("John", 40000, manager);
        Employee emp2 = new Employee("Alice", 55000, manager);
        Employee emp3 = new Employee("Bob", 70000, manager);
        Employee emp4 = new Employee("Jane", 75000, manager);

       return Arrays.asList(manager, emp1,emp2,emp3,emp4);
    }
}

