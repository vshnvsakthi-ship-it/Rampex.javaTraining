package Day22.hometask;

import java.util.*;
import java.util.stream.*;

public class MostFrequentWord {
    public static void main(String[] args) {
        String input = "java python java spring java python";

        Map<String, Long> freqMap = Arrays.stream(input.toLowerCase().split(" "))
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        Map.Entry<String, Long> maxEntry = freqMap.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get();

        System.out.println(maxEntry.getKey() + " -> " + maxEntry.getValue());
    }
}