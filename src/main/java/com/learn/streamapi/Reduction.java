package com.learn.streamapi;

import java.util.ArrayList;
import java.util.List;

public class Reduction {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(31);
        numbers.add(54);
        numbers.add(4);
        numbers.add(10);
        numbers.add(37);

        Integer sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);//passing accumulator
        System.out.println(sum);
    }
}
