package Day21.hometask;

import java.util.*;

public class LongestString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "SpringBoot", "SQL", "Microservices");

        String result = list.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse("");

        System.out.println(result);
    }
}
