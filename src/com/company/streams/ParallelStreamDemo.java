package com.company.streams;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamDemo {
    public static void main(String [] args){
        List<Integer> intList = Arrays.asList(3,4,2,9,8,1,9);
        //till now concepts of sequential streams was implemented
        //Sequential Stream - It follows order and runs items in a sequence,it is slow in processing
        //Parallel Stream - It runs in multiple threads ,do not follow order, it's faster in processing

        intList.stream().forEach(System.out::println);

        System.out.println("================================" );

        intList.stream().parallel().forEach(System.out::println);
        System.out.println("================================");

        //same as 17 th line
        intList.parallelStream().forEach(System.out::println);
    }
}
