package com.company.interfaceenhancement.doubleconlonoperator;

public class Employee {

    public Employee(){
        System.out.println("Default Constructor");
    }
    public void details(){
        System.out.println("Showing employee details");
    }
    public void details2(int number){
        System.out.println("employee details 2 with 1 param : "+number);
    }
    public static void detailsStatic(int number){
        System.out.println("employee detailsStatic with 1 param : "+number);
    }
}
