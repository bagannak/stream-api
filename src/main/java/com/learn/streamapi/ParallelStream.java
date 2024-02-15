package com.learn.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ParallelStream {
    public static void main(String[] args) {
        long start;
        long end;
        // Sequential stream
        start = System.currentTimeMillis();
        IntStream.range(1, 1000)
                .forEach(System.out::print);
        end = System.currentTimeMillis();
        System.out.println(" ");
        System.out.println("Sequential time taken:" + (end - start));
        System.out.println("===============================================");
        // Parallel stream
        start = System.currentTimeMillis();
        IntStream.range(1, 1000)
                .parallel()
                .forEach(System.out::print);
        end = System.currentTimeMillis();
        System.out.println(" ");
        System.out.println("Parallel time taken:" + (end - start));
    }
}

