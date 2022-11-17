package com.company.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMinMax {
    public static void main(String[] args){
        List<Integer> numList = Arrays.asList(45,9,27,54,18,72);
        List<Integer> duplicateNumList = Arrays.asList(45,9,27,54,18,72,27,54,18,72);

        Integer minVal1 =numList.stream().min((a,b)->a.compareTo(b)).get();

        /*Integer minVal =numList.stream().min((a,b)->{return a.compareTo(b);}).get();

        Integer maxVal =numList.stream().max((a,b)->{return a.compareTo(b);}).get();
*/
        Integer minVal =numList.stream().min(StreamMinMax::sortElements).get();

        Integer maxVal =numList.stream().max(StreamMinMax::sortElements).get();

        System.out.println("Min Value : " +minVal);
        System.out.println("Min Value : " +minVal1);
        System.out.println("Max Value : " +maxVal);
        System.out.println("Min Value : " +maxVal+", Min Value : "+minVal+", Max Value : "+maxVal);

        List<Integer> dupSortList = duplicateNumList.stream().sorted().collect(Collectors.toList());
        System.out.println("Duplicate Sorted List : "+dupSortList);

        List<Integer> distinctSortList = duplicateNumList.stream().sorted().distinct().collect(Collectors.toList());
        System.out.println("Distinct Sorted List : "+distinctSortList);
    }
    public static Integer sortElements(Integer a,Integer b){
        return a.compareTo(b);
    }
}
