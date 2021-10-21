package com.company;

public class Thread1 extends Thread{
    public void run(){
        synchronized (this){
            System.out.println(Thread.currentThread().getName()+" is running");
            try{
                this.wait();
                System.out.println(Thread.currentThread().getName()+"-> Wait method invoked");
            }
            catch (Exception e){
                e.printStackTrace();
                System.out.println("Exception occurred... Inside catch");
            }
        }
    }
}
