package com.learn.streamapi;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

record Student(String name, double grade) {
}

public class PartitioningBy {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("John", 85),
                new Student("Alice", 60),
                new Student("Bob", 75),
                new Student("Jane", 90),
                new Student("Mark", 55)
        );

        Map<Boolean, List<Student>> passingFailing = students.stream()
                .collect(Collectors.partitioningBy(student -> student.grade() >= 60));//passing predicate

        System.out.println("Passing students:");
        passingFailing.get(true).forEach(student -> System.out.println(student.name()));

        System.out.println("\nFailing students:");
        passingFailing.get(false).forEach(student -> System.out.println(student.name()));
    }
}

