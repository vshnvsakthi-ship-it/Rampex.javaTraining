package Day21.classtask;

import java.util.*;
import java.util.stream.Collectors;

class SortByLength {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "SpringBoot", "SQL", "Microservices");

        List<String> result = list.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());

        System.out.println(result);
    }
}