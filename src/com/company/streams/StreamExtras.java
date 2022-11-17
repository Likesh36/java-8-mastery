package com.company.streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExtras {
    public static void main(String[] args) {
        int[] a = {2, 5, 7, 4, 3, 1, 6, 9, 8, 2, 5, 7, 4, 3};
        //double
        //long
        IntStream is = Arrays.stream(a);//this method of converting to stream only works for primitive int, double, long
        //is.sorted();

        Stream s1 = Stream.of(a);

        Stream s2 = Stream.of(3, 6, 9, 27, 18, 45, 15);

        Stream s3 = Stream.of(12, 30, 21, 36, 24, 33);

        Stream s4 = Stream.concat(s2, s3).distinct();

        //s4.forEach(System.out::println);

        //range of numbers from stream

        IntStream intStream3_18 =IntStream.range(3,19);//11 will be excluded

        intStream3_18.forEach(value -> System.out.print(" " +value));

        System.out.println(  );

        IntStream intStream3_19 =IntStream.rangeClosed(3,19);//11 will be included

        intStream3_19.forEach(value -> System.out.print(" " +value));
    }
}
