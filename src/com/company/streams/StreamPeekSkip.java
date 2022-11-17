package com.company.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPeekSkip {
    public static void main(String[] args){
        List<String> flats = Arrays.asList("I01","R03","R04","I02","I08","R09","I07","R05","I06","I02","I08","R09","I07","R05","I06");

        List<String> flatsWithR = flats.stream().filter(flat->flat.startsWith("R")).sorted().peek(System.out::println).distinct().skip(1).collect(Collectors.toList());
        System.out.println(flatsWithR);
    }
}
