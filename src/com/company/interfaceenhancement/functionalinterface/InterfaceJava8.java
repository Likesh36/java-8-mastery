package com.company.interfaceenhancement.functionalinterface;

@FunctionalInterface
public interface InterfaceJava8 {
    public void show();// one abstract method
    //public void details();
    //public String enquire();

    public default void details(){// more than one default method

    }
    public default void details2(){// more than one default method

    }
    public static String enquire(){// more than one static method
        return "Functional Interface";
    }
    public static String enquire2(){// more than one static method
        return "Functional Interface";
    }
}
