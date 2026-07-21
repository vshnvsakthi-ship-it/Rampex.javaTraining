package Day25.hometask;

import java.util.*;
import java.util.stream.*;

class Employee {
    int id;
    String name;
    String department;
    double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class SecondHighestSalary {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee(1, "A", "IT", 50000),
                new Employee(2, "B", "HR", 60000),
                new Employee(3, "C", "IT", 70000),
                new Employee(4, "D", "HR", 60000)
        );

        Optional<Double> secondHighest = list.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        secondHighest.ifPresent(System.out::println);
    }
}
