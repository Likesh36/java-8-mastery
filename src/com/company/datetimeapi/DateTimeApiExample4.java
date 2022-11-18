package com.company.datetimeapi;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeApiExample4 {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("My current time zone is "+zoneId);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Date and time at my current time zone : "+localDateTime);

        ZoneId zoneIdLA = ZoneId.of("America/Los_Angeles");
        //System.out.println(zoneIdLA);
        System.out.println("Date and time at LA : "+LocalDateTime.now(zoneIdLA));
        LocalDateTime localDateTime1 = LocalDateTime.now(zoneIdLA);
        System.out.println("Date and time at LA : "+localDateTime1);

        System.out.println("Date and time at LA : "+ ZonedDateTime.now(zoneIdLA));

        ZoneId zoneIdGMT = ZoneId.of("GMT+03:30");
        System.out.println("Date and time at GMT+03:30 : "+ZonedDateTime.now(zoneIdGMT));

        ZoneId zoneIdGMT00 = ZoneId.of("GMT+00:00");
        System.out.println("Date and time at GMT+00:00 : "+ZonedDateTime.now(zoneIdGMT00));

        System.out.println(Instant.now());//same as gmt

    }
}
