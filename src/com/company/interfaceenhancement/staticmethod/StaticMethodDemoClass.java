package com.company.interfaceenhancement.staticmethod;

public class StaticMethodDemoClass implements StaticMethodDemo{

    public static void show(){//Static method do not get available in implementing class
        System.out.println("I am a normal method of this static method demo class");
    }
    public static void main(String[] a){
        StaticMethodDemoClass obj =new StaticMethodDemoClass();
        obj.show();

        //did not get methods created in interface with obj.method
        //but while directly putting interface StaticMethodDemo got method for implementing
        StaticMethodDemo.show();//static method can be called by the name of the interface
    }

}
