package com.company.interfaceenhancement.doubleconlonoperator;

public class TwoMain {

    public static void main(String[] args){
        //ConsRefFuncInterface consRefFuncInterface = () -> new Employee();
        /*ConsRefFuncInterface consRefFuncInterface = () -> {Employee e = new Employee();
            return e;
        };*/

        //consRefFuncInterface.getEmployee();

        ConsRefFuncInterface consRefFuncInterface2 = Employee::new;
        consRefFuncInterface2.getEmployee();
    }
}
