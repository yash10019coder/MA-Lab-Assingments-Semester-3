package com.company;

import java.security.spec.ECField;

class Table
{
    synchronized static void printTable(int n)
    {
        for (int i = 1; i <= 3; i++)
        {
            System.out.println(n*i);
            try
            {
                Thread.sleep(400);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}

class Thread1 extends Thread
{
    public void run()
    {
        Table.printTable(1);
    }
}

class Thread2 extends Thread
{
    public void run()
    {
        Table.printTable(10);
    }
}

class Thread3 extends Thread
{
    public void run()
    {
        Table.printTable(100);
    }
}

public class StaticSynchronizedMethod
{
    public static void main(String[] args)
    {
        Thread1 t1  = new Thread1();
        Thread2 t2  = new Thread2();
        Thread3 t3  = new Thread3();
        t1.start();
        t2.start();
        t3.start();
    }
}
