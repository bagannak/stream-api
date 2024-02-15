package com.learn.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

//        List<Integer> flattenedList2 = new ArrayList<>();
//        for (List<Integer> list : listOfLists) {
//            flattenedList.addAll(list);
//        }
        List<Integer> flattenedList = listOfLists.stream()
                .flatMap(list -> list.stream()) // Flatten the list of lists
                .collect(Collectors.toList());
        System.out.println(flattenedList);

    }
}

