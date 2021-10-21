package com.company;

public class Main extends Thread{
    public void run(){
        if(Thread.interrupted()){
            System.out.println(Thread.currentThread().getName()+" is interrupted Thread");
        }
        else{
            System.out.println(Thread.currentThread().getName()+" is Normal Thread");
        }
        try{
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+" on sleep");
        }
        catch (Exception e){
            System.out.println("Exception Handled "+ e);
        }
    }
    public static void main(String[] args)
    {
        Main t1 = new Main();
        Main t2 = new Main();
        Main t3 = new Main();
        Main t4 = new Main();
        t1.start();
        t1.interrupt();
        t2.start();
        t3.start();
        t3.interrupt();
        t4.start();
    }
}
