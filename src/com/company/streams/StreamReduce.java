package com.company.streams;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamReduce {
    public static void main(String[] args){
        //Calculate the sum of 10 numbers
        OptionalInt optIntSum = IntStream.rangeClosed(1,9).reduce((a, b)->a+b);
        System.out.println(optIntSum);
    }
}
