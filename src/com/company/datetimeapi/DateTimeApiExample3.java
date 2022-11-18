package com.company.datetimeapi;

import java.time.LocalDate;
import java.time.Period;

public class DateTimeApiExample3 {
    public static void main(String[] args) {

        //Get the total experience of an employee
        LocalDate todayDate = LocalDate.now();
        //System.out.println(todayDate);
        LocalDate startDate = LocalDate.of(2009,8,18);

        Period period = Period.between(startDate,todayDate);//start date is inclusive and today's date is exclusive
        System.out.println("Your total work experience : " +period.getYears()+" years");
        System.out.printf("Total work experience is %d years, %d months, %d days ",period.getYears(),period.getMonths(),period.getDays());

        //you have exam at a date ,you want to know how much time is you have or left
        LocalDate todayDate1 = LocalDate.now();
        LocalDate examDate = LocalDate.of(2024,12,18);

        System.out.println("===========");
        Period period1 =Period.between(todayDate1,examDate);
        System.out.printf("Time I have for exam : %d years, %d months, %d days ",period1.getYears(),period1.getMonths(),period1.getDays());

    }
}
