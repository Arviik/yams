package com.example;

import java.util.List;

public class Yams {

    private Yams() {
    }

    public static int getScore(List<Integer> rolls) {
        if (rolls.stream().distinct().count() <= 1) {
            return 50;
        }

        return rolls.stream().mapToInt(Integer::intValue).sum();
    }
}
