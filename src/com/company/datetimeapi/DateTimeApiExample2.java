package com.company.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTimeApiExample2 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        System.out.println("Date after 27 days : " + date.plusDays(27));
        System.out.println("Date after 18 weeks: " + date.plusWeeks(18));
        System.out.println("Date after 18 months : " + date.plusMonths(18));
        System.out.println("Date after 9 years : " + date.plusYears(9));

        System.out.println("Date before 27 days : " + date.minusDays(27));
        System.out.println("Date before 18 weeks: " + date.minusWeeks(18));
        System.out.println("Date before 18 months : " + date.minusMonths(18));
        System.out.println("Date before 9 years : " + date.minusYears(9));

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        System.out.println("Time before 9 hours : " + dateTime.minusHours(9));
        System.out.println("Date after 20 days : " + dateTime.plusDays(20));
    }
}
