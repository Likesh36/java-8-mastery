package com.company.interfaceenhancement.lambda.thread;

public class CodeToRunAsSeparateThread implements Runnable{

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        for(Integer count=1;count<=5;count++){
            System.out.println(" Child thread counter value  is : " +count);
        }
    }
}
