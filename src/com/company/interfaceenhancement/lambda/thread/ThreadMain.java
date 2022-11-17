package com.company.interfaceenhancement.lambda.thread;
//this is how in java 7 we do like this
public class ThreadMain {
    public static void main(String[] args){
       // Runnable runnable= new CodeToRunAsSeparateThread();

        Runnable runnable = () -> {
            for (Integer count = 1; count <= 5; count++) {
                System.out.println(" Child thread counter value  is : " + count);
            }
        };

        Thread thread =new Thread(runnable);
        thread.start();

        for(Integer count=1;count<=5;count++){
            System.out.println(" Main thread counter value  is : " +count);
        }
    }
}
