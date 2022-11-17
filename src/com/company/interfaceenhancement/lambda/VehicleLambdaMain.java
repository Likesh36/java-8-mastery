package com.company.interfaceenhancement.lambda;

public class VehicleLambdaMain {

    public static void main(String[] args){
        //Vehicle vehicle = ()->{System.out.println("Vehicle details from lambda");}; //multi code line implementation ,use flower brackets

        Vehicle vehicle = ()->System.out.println("Vehicle details from lambda");
        vehicle.details();

        //Calculator calculator =(Integer a,Integer b)->{ return a + b ; };
        //Calculator calculator =a->a+a;
        Calculator calculator =(Integer a,Integer b) -> a + b ;
        Integer result = calculator.add(54,45);
        System.out.println(result);

        MultiplyInterface multiplyInterface = () -> System.out.println("I am a converted Lambda function");
        //multiplyInterface = ()-> a*b;

    }

    /*public void multiply(){
        System.out.println("I am a normal function");
    }*/
    //1.Remove modifier (public)
    //2.Remove return type(void)
    //3.Remove method name(multiply)
    //4.Add->(arrow) sign

}
