package com.company;
import java.io.*;
import java.util.*;

public class Deadlock
{
    public static Object Lock1 = new Object();
    public static Object Lock2 = new Object();
    public static Object Lock3 = new Object();
    public static Object Lock4 = new Object();
    public static void main(String[] args) throws InterruptedException
    {
        ThreadDemo1 T1 = new ThreadDemo1();
        ThreadDemo2 T2 = new ThreadDemo2();
        ThreadDemo3 T3 = new ThreadDemo3();
        ThreadDemo4 T4 = new ThreadDemo4();
        T1.start();
        T2.start();
        T3.start();
        T4.start();
    }
}

class ThreadDemo1 extends Thread
{
    public void run()
    {
        synchronized (Deadlock.Lock1)
        {
            System.out.println("Thread 1 : Holding Lock 1...");
            try
            {
                Thread.sleep(58);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
            System.out.println("Thread 1 : Waiting for Lock 2...");
            synchronized (Deadlock.Lock2)
            {
                System.out.println("Thread 1 : Holding Lock 1 and Lock 2...");
            }
        }
    }
}

class ThreadDemo2 extends Thread
{
    public void run()
    {
        synchronized (Deadlock.Lock2)
        {
            System.out.println("Thread 2 : Holding Lock 2...");
            try
            {
                Thread.sleep(50);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
            System.out.println("Thread 2 : Waiting for Lock 3...");
            synchronized (Deadlock.Lock3)
            {
                System.out.println("Thread 2 : Holding Lock 2 and Lock 3");
            }
        }
    }
}

class ThreadDemo3 extends Thread
{
    public void run()
    {
        synchronized (Deadlock.Lock2)
        {
            System.out.println("Thread 3 : Holding Lock 3...");
            try
            {
                Thread.sleep(50);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
            System.out.println("Thread 3 : Waiting for Lock 4...");
            synchronized (Deadlock.Lock3)
            {
                System.out.println("Thread 3 : Holding Lock 3 and Lock 4");
            }
        }
    }
}

class ThreadDemo4 extends Thread
{
    public void run()
    {
        synchronized (Deadlock.Lock4)
        {
            System.out.println("Thread 4 : Holding Lock 4...");
            try
            {
                Thread.sleep(50);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
            System.out.println("Thread 4 : Waiting for Lock 1...");
            synchronized (Deadlock.Lock1)
            {
                System.out.println("Thread 4 : Holding Lock 4 and Lock 1");
            }
        }
    }
}
