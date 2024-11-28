package com.example;

import java.util.*;

public class Yams {

    private Yams() {
    }

    public static int getScore(List<Integer> rolls) {
        if (rolls.stream().distinct().count() <= 1) {
            return 50;
        }

        if (rolls.stream().distinct().count() == 5) {
            return 40;
        }

        Map<Integer, Integer> occurrences = Yams.getOccurrences(rolls);

        int maxNumberOfOccurrences = Collections.max(occurrences.values());

        if (maxNumberOfOccurrences == 4) {
            return 35;
        }

        if (maxNumberOfOccurrences == 3 && occurrences.containsValue(2)) {
            return 30;
        }

        if (maxNumberOfOccurrences == 3) {
            return 28;
        }



        return rolls.stream().mapToInt(Integer::intValue).sum();
    }

    private static Map<Integer, Integer> getOccurrences(List<Integer> rolls) {
        Map<Integer, Integer> occurrences = new HashMap<>();

        for (int roll : rolls) {
            occurrences.compute(roll, (rollValue, numberOfOccurrences) -> {
                if (numberOfOccurrences == null) {
                    return 1;
                }

                return numberOfOccurrences + 1;
            });
        }

        return occurrences;
    }
}
