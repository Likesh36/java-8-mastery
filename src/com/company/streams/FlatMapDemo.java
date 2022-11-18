package com.company.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemo {
    public static void main(String[] args){
        List<Integer> numList = Arrays.asList(18,27,36,45,54,63,72,81);
        System.out.println("Number list : "+numList);

        List<Integer> numListNew = numList.stream().map(x->x*2).collect(Collectors.toList());
        System.out.println("Updated number list : "+numListNew);

        List numListNew1 = numList.stream().map(x->Arrays.asList(x,x+9)).collect(Collectors.toList());
        System.out.println("Updated number list : "+numListNew1);

        List numFlatList = numList.stream().flatMap(x-> Stream.of(x,x+9,x+18)).collect(Collectors.toList());
        System.out.println("Flat Map Number List : "+numFlatList);

        List newFlatList = numList.stream().flatMap(x->{
            if(x%2!=0){
                return Stream.empty();
            }else{
                return Stream.of(x,x*2,x*3,x*4);
            }
        }).collect(Collectors.toList());

        System.out.println("New Flat Map Number List : "+newFlatList);
    }
}
