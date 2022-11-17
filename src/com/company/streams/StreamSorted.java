package com.company.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSorted {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(81);
        numbers.add(63);
        numbers.add(72);
        numbers.add(27);
        numbers.add(36);
        numbers.add(54);
        numbers.add(45);
        numbers.add(99);
        numbers.add(18);

        //normal insertion order
        System.out.println(numbers);//[81, 63, 72, 27, 36, 54, 45, 99, 18]
        //ascending sort
        System.out.println(numbers.stream().sorted().collect(Collectors.toList()));//[18, 27, 36, 45, 54, 63, 72, 81, 99]
        //custom ascending sorting order
        System.out.println(numbers.stream().sorted((elem1,elem2)->elem1.compareTo(elem2)).collect(Collectors.toList()));//[18, 27, 36, 45, 54, 63, 72, 81, 99]
        //custom descending sorting order
        System.out.println(numbers.stream().sorted((elem1,elem2)->elem2.compareTo(elem1)).collect(Collectors.toList()));//[99, 81, 72, 63, 54, 45, 36, 27, 18]
        System.out.println(numbers.stream().sorted((elem1,elem2)->-elem1.compareTo(elem2)).collect(Collectors.toList()));//[99, 81, 72, 63, 54, 45, 36, 27, 18]
    }
}
