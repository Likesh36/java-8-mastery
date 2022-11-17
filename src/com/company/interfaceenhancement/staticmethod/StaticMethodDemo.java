package com.company.interfaceenhancement.staticmethod;

public interface StaticMethodDemo {

    public static void show(){//static methods do not get available in implementing class
        System.out.println("I am Java 8 static method");
    }
    public static void show2(){//static methods do not get available in implementing class
        System.out.println("I am Java 8 static method 2");
    }
}
