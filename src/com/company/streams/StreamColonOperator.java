package com.company.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamColonOperator {
    public static void main(String[] args) {

        List<String> alphaNumerics = Arrays.asList("I9","I54","i36","i27","R45");
        System.out.println(alphaNumerics);

        //List<String> stringList = alphaNumerics.stream().filter(e->e.startsWith("I")).collect(Collectors.toList());//[I9, I54]
        List<String> stringList = alphaNumerics.stream().map(i->i.toUpperCase()).filter(e->e.startsWith("I")).collect(Collectors.toList());//[I9, I54, I36, I27]
        System.out.println(stringList);

        List<String> stringList1 = alphaNumerics.stream().map(String::toUpperCase).filter(e->e.startsWith("I")).collect(Collectors.toList());//[I9, I54, I36, I27]
        System.out.println(stringList1);

        //filter operation is a lazy operation on stream
        alphaNumerics.stream().filter(input->{
            System.out.println(input);
            return input.startsWith("I");
        }).collect(Collectors.toList());
        //same as above
        alphaNumerics.stream().filter(input->{
            System.out.println(input);
            return input.startsWith("I");
        }).count();

        alphaNumerics.stream().map(String::toUpperCase).filter(e->e.startsWith("I")).forEach(a-> System.out.println(a));
        //same as line 32
        alphaNumerics.stream().map(String::toUpperCase).filter(e->e.startsWith("I")).forEach(System.out::println);





    }
}
