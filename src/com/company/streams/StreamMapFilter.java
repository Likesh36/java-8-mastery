package com.company.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapFilter {

    public static void main(String[] args){
        List<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Pomegranate");
        fruits.add("Kiwi");
        fruits.add("Papaya");
        fruits.add("Litchi");


        //print length of every fruit
        System.out.println(fruits.stream().map(f->f.length()).collect(Collectors.toList()));// output -[5, 5, 6, 6, 6, 11, 4, 6, 6]
        //print only those fruits whose length is greater than 5 characters is boolean
        System.out.println(fruits.stream().map(f->f.length()>5).collect(Collectors.toList()));//output -[false, false, true, true, true, true, false, true, true]
        //find only those fruits whose length is greater than 5 characters
        System.out.println(fruits.stream().filter(f->f.length()>5).collect(Collectors.toList()));//output -[Orange, Banana, Grapes, Pomegranate, Papaya, Litchi]
        //find only those fruit's length whose length is greater than 5 characters
        System.out.println(fruits.stream().filter(f->f.length()>5).map(f->f.length()).collect(Collectors.toList()));//output -[[6, 6, 6, 11, 6, 6]
        //how many fruits exist that have length greater than 5
        //both 32 and 34 are with same function
        //System.out.println(fruits.stream().filter(f->f.length()>5).count());//output- 6
        Long noOfFruitsWithLengthGt5 =fruits.stream().filter(f->f.length()>5).count();
        System.out.println(noOfFruitsWithLengthGt5);//output- 6
    }
}
