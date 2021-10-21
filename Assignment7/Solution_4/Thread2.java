package com.company;

public class Thread2 extends Thread{
    Thread t1;
    Thread2(Thread1 t1)
    {
        this.t1=t1;
    }
    public void run(){
        synchronized (this.t1){
            System.out.println(Thread.currentThread().getName()+" is running");
            try{
                this.t1.notify();
                System.out.println(Thread.currentThread().getName()+"-> Notify method invoked");
            }
            catch (Exception e){
                e.printStackTrace();
                System.out.println("Exception occurred... Inside catch");
            }
        }
    }
}
