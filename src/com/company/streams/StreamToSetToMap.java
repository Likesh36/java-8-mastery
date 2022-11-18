package com.company.streams;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static java.util.stream.Collectors.*;

public class StreamToSetToMap {
    public static void main(String[] args){
        Set<Integer> numSet = new HashSet<>();
        numSet.add(1);
        numSet.add(13);
        numSet.add(21);
        numSet.add(45);
        numSet.add(8);
        numSet.add(3);

        //Set<Integer> filteredSet =numSet.stream().filter(a->a>3).collect(Collectors.toSet());
        Set<Integer> filteredSet =numSet.stream().filter(a->a>3).collect(toSet());

        System.out.println(filteredSet);

        //{1,100}, {13,1300}, {21,2100}, {45,4500}, {8,800}, {3,300}

        Map<Integer ,Integer> newMap =numSet.stream().collect(toMap(x->x, y->y*100));
        System.out.println(newMap);


    }
}
