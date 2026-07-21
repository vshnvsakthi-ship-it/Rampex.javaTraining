package Day25.hometask;

import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

public class DeptHighestSalary {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee(1, "A", "IT", 50000),
                new Employee(2, "B", "HR", 60000),
                new Employee(3, "C", "IT", 70000),
                new Employee(4, "D", "HR", 80000)
        );

        Map<String, Employee> result = list.stream()
                .collect(groupingBy(
                        e -> e.department,
                        collectingAndThen(
                                maxBy(Comparator.comparing(Employee::getSalary)),
                                Optional::get
                        )
                ));

        result.forEach((dept, emp) ->
                System.out.println(dept + " -> " + emp.name + " : " + emp.salary)
        );
    }
}