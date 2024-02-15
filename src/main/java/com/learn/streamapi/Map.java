package com.learn.streamapi;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
class Employees {
    private int ENo;
    private double salary;
    private double experience;
}

public class Map {
    public static void main(String[] args) {
        List<Employees> employees = Arrays.asList(new Employees(123, 20000, 1),
                new Employees(234, 36806, 1.4),
                new Employees(453, 67000, 3.2),
                new Employees(523, 56743, 2.5),
                new Employees(542, 67849, 2.6));

        List<Employees> updatedSalary = employees.stream().
                filter(employee -> employee.getExperience() > 1.6)
                .map(employee -> {
                    employee.setSalary(employee.getSalary() + 10000);
                    return employee;
                }).collect(Collectors.toList());
        System.out.println(updatedSalary);

    }
}
