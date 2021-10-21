package _1_;
import java.util.concurrent.ThreadFactory;

class Player extends Thread
{
   static Thread t1,t2,t3;

    public Player(String name)
    {
        super(name);
    }
    public void run()
    {
        
        if(Thread.currentThread()==t1)
        {
            try
            {
                t1.sleep(5000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            
            System.out.println("Thread " + t1.getName()+" is in state: "+t1.getState());
            System.out.println("Thread " + t2.getName()+" is in state: "+t2.getState());
            System.out.println("Thread " + t3.getName()+" is in state: "+t3.getState()+"\n");
        }
        else if(Thread.currentThread()==t2)
        {
            try
            {
                t1.join();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }

            System.out.println("Thread " + t1.getName()+" is in state: "+t1.getState());
            System.out.println("Thread " + t2.getName()+" is in state: "+t2.getState());
            System.out.println("Thread " + t3.getName()+" is in state: "+t3.getState()+"\n");
        }
        else
        {
            try
            {
                t2.join();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }

            System.out.println("Thread " + t1.getName()+" is in state: "+t1.getState());
            System.out.println("Thread " + t2.getName()+" is in state: "+t2.getState());
            System.out.println("Thread " + t3.getName()+" is in state: "+t3.getState()+"\n");
        }
    }
}

public class ThreadLifeCycle
{
    public static void main(String args[])
    {
        Player p1 = new Player("Sachin");
        Player p2 = new Player("Virat");
        Player p3 = new Player("Sehwag");
        
        Player.t1=p1; Player.t2=p2; Player.t3=p3;

        System.out.println("State of thread "+ p1.getName() + ": " + p1.getState());
        System.out.println("State of thread "+ p2.getName() + ": " + p2.getState());
        System.out.println("State of thread "+ p3.getName() + ": " + p3.getState()+"\n");

        p2.start();
        p3.start();
        p1.start();

        try
        {
            Thread.currentThread().sleep(3000);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        System.out.println("State of thread "+ p1.getName() + ": " + p1.getState());
        System.out.println("State of thread "+ p2.getName() + ": " + p2.getState());
        System.out.println("State of thread "+ p3.getName() + ": " + p3.getState()+"\n");
    }
}

/**
 * Output: 
 * 
 * ubuntu@ubuntu-linux:~/Documents/college/AdvancedJavaMA/Assignment6$
 * /usr/bin/env /usr/lib/jvm/java-11-openjdk-amd64/bin/java
 * -Dfile.encoding=UTF-8 -cp
 * /home/ubuntu/.config/Code/User/workspaceStorage/0e7b35696775f25fd31f418aae959ecd/redhat.java/jdt_ws/Assignment6_449183e8/bin
 * _1_.ThreadLifeCycle State of thread Sachin: NEW State of thread Virat: NEW
 * State of thread Sehwag: NEW
 * 
 * State of thread Sachin: TIMED_WAITING State of thread Virat: WAITING State of
 * thread Sehwag: WAITING
 * 
 * Thread Sachin is in state: RUNNABLE Thread Virat is in state: WAITING Thread
 * Sehwag is in state: WAITING
 * 
 * Thread Sachin is in state: TERMINATED Thread Virat is in state: RUNNABLE
 * Thread Sehwag is in state: WAITING
 * 
 * Thread Sachin is in state: TERMINATED Thread Virat is in state: TERMINATED
 * Thread Sehwag is in state: RUNNABLE
 * 
 */