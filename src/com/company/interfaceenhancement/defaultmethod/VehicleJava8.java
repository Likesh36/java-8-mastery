package com.company.interfaceenhancement.defaultmethod;

public interface VehicleJava8 {

     default void details(){//by defaults gets available to all the implementing classes
        System.out.println("I am java 8 default method");
    }
    void mileage();
}
