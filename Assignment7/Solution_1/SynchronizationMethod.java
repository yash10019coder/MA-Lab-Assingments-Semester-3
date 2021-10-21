package com.company;

class Line
{
    synchronized public void getLine()
    {
        for (int i = 0; i < 3; i++)
        {
            System.out.println(i);
            try
            {
                Thread.sleep(400);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}

class Train extends Thread
{
    Line Line;
    Train(Line line)
    {
        this.Line = line;
    }

    @Override
    public void run()
    {
        Line.getLine();
    }
}

public class SynchronizationMethod
{
    public static void main(String[] args)
    {
        Line obj = new Line();
        Train train1 = new Train(obj);
        Train train2 = new Train(obj);
        train1.start();
        train2.start();
    }
}
