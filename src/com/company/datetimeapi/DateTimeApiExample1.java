package com.company.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateTimeApiExample1 {
    public static void main(String[] args){

        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        //get day,month,year
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfYear());
        System.out.println(date.getMonthValue());
        System.out.println(date.getMonth());
        System.out.println(date.getYear());

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        //get hour,min,sec
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.getNano());

        //LocalDateTime futureDateTime = LocalDateTime.of(2022,12,18,9,45,45,459);
        LocalDateTime futureDateTime = LocalDateTime.of(2022, Month.DECEMBER,18,9,45,45,459);
        System.out.println(futureDateTime);


    }
}
