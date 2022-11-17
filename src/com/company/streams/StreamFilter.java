package com.company.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamFilter {

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
        // until java 7 - sorting odd numbers
        List<Integer> oddNumbers = new ArrayList<>();
        for (Integer num:numbers) {
            if(num%2 != 0){
                oddNumbers.add(num);
            }
        }
        System.out.println(oddNumbers);//[81, 63, 27, 45, 99]-output

        //Java 8 - streams
        //Stream<Integer>stream=numbers.stream();
        //oddNumbers = numbers.stream().filter(num -> num % 2 != 0).collect(Collectors.toList());
        Predicate<Integer> oddEvenPredicate = num -> num % 2 != 0;
        oddNumbers = numbers.stream().filter(oddEvenPredicate).collect(Collectors.toList());
        System.out.println("Odd numbers using Java-8 Stream : "+oddNumbers);
    }
}
