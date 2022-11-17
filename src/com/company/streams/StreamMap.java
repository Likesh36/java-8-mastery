 package com.company.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamMap {

    public static void main(String[] args){
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

        System.out.println(numbers);//[81, 63, 72, 27, 36, 54, 45, 99, 18]-output
        //Output should be [243, 189, 216, 81, 108, 162, 135, 297, 54]

        List<Integer> output= numbers.stream().map(input->input*3).collect(Collectors.toList());
        System.out.println("Output of mapping is : "+output);
    }
}
