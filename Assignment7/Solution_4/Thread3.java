package com.company;

public class Thread3 extends Thread{
    Thread t1;
    Thread3(Thread1 t1)
    {
        this.t1=t1;
    }
    public void run(){
        synchronized (this.t1){
            System.out.println(Thread.currentThread().getName()+" is running");
            try{
                this.t1.notifyAll();
                System.out.println(Thread.currentThread().getName()+"-> NotifyAll method invoked");
            }
            catch (Exception e){
                e.printStackTrace();
                System.out.println("Exception occurred... Inside catch");
            }
        }
    }
}
