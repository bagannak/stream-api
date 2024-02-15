package com.learn.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Conversion {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
        Map<String, Integer> lengthOfWords = words.stream().collect(Collectors.toMap(word -> word, word -> word.length()));

        System.out.println(lengthOfWords);
    }
}
