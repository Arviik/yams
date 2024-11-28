package com.example;

import java.util.List;

public class Yams {

    private Yams() {
    }

    public static int getScore(List<Integer> rolls) {
        return rolls.stream().mapToInt(Integer::intValue).sum();
    }
}
