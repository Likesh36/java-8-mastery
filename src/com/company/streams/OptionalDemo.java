package com.company.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {//after main() we can also write throws NullPointerException
        List<String> flats = Arrays.asList("I01", "R03", "R04", "I02", "I08", "R09", "I07", "R05", "I06", "I02", "I08", "R09", "I07", "R05", "I06");

        Optional<String> opt = flats.stream().filter(flat -> flat.startsWith("y")).findFirst();
        /*if (opt.isPresent()) {
            System.out.println(opt.get());
        }else {
            System.out.println("Not found");
        }*/

        //opt.ifPresent(data ->System.out.println(data));

        opt.ifPresent(System.out::println);
        System.out.println(opt.orElse("no data found"));//no data found
        //same as 22 line
        String output = opt.orElseGet(()->{return "no data";});//no data
        System.out.println(output);

        //opt.orElseThrow(()->{return new NullPointerException();});

        //opt.orElseThrow(()-> new NullPointerException());
        Optional<String> opt1 = Optional.of("Java is awesome");
        System.out.println(opt1);//Optional[Java is awesome]
        System.out.println(opt1.get());//Java is awesome

        String name=null;
        Optional<String>opt2 = Optional.ofNullable(name);//return empty for null value
        System.out.println(opt2);//Optional.empty

        String name1="Hello";
        Optional<String>opt3 = Optional.ofNullable(name1);//return empty for null value
        System.out.println(opt3);//Optional.empty
    }
}
