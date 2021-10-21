package _2_;

class saniya extends Thread {
    public saniya(String name) {
        super(name);
    }

    public void run() {
        try {
            Thread.sleep(100);
        } catch (Exception e) {
        }
        ;
        System.out.println(Thread.currentThread().getName() + " is " + Thread.currentThread().getState());
        for (int i = 1; i <= 10; i++)
            System.out.println(Thread.currentThread().getName() + " performing task " + i);
    }
}

class serena extends Thread {
    public serena(String name) {
        super(name);
    }

    public void run() {
        try {
            Thread.sleep(200);
        } catch (Exception e) {
        }
        ;
        System.out.println(Thread.currentThread().getName() + " is " + Thread.currentThread().getState());
        for (int i = 1; i <= 10; i++)
            System.out.println(Thread.currentThread().getName() + " performing task " + i);
    }
}

class maria extends Thread {
    public maria(String name) {
        super(name);
    }

    public void run() {
        try {
            Thread.sleep(800);
        } catch (Exception e) {
        }
        ;
        System.out.println(Thread.currentThread().getName() + " is " + Thread.currentThread().getState());
        for (int i = 1; i <= 10; i++)
            System.out.println(Thread.currentThread().getName() + " performing task " + i);
    }
}

public class JavaThreadMethods {
    public static void main(String args[]) throws Exception {
        saniya p1 = new saniya("Saniya");
        maria p2 = new maria("Maria");
        serena p3 = new serena("Serena");

        p1.run();
        p1.setPriority(10);
        p2.setPriority(1);
        p3.setPriority(1);

        p3.start();
        for (int j = 1; j <= 3; j++) {
            System.out.println("Main thread performing when " + p3.getName() + " is in state " + p3.getState());
        }

        p1.start();
        p2.start();

        for (int j = 1; j <= 3; j++) {
            System.out.println("Main thread performing when " + p1.getName() + " is in state " + p1.getState());
        }

        for (int j = 1; j <= 3; j++) {
            System.out.println("Main thread performing when " + p2.getName() + " is in state " + p2.getState());
        }

        Thread.currentThread().yield();

        p1.suspend();
        p2.suspend();
        p3.suspend();
        System.out.println("This is being executed from the main function and all the threads have been suspended.");
        System.out.println("State of " + p1.getName() + ": " + p1.getState());
        System.out.println("State of " + p2.getName() + ": " + p2.getState());
        System.out.println("State of " + p3.getName() + ": " + p3.getState());

        p1.resume();
        p2.resume();
        p3.resume();

        p1.join();
        p2.join();
        p3.join();

        System.out.println("All the created threads have been executed. Now the program ends");

    }
}
/*
  Output: 
  ubuntu@ubuntu-linux:~/Documents/college/AdvancedJavaMA/Assignment6$  cd /home/ubuntu/Documents/college/AdvancedJavaMA/Assignment6 ; /usr/bin/env /usr/lib/jvm/java-11-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /home/ubuntu/.config/Code/User/workspaceStorage/0e7b35696775f25fd31f418aae959ecd/redhat.java/jdt_ws/Assignment6_449183e8/bin _2_.JavaThreadMethods 
main is RUNNABLE
main performing task 1
main performing task 2
main performing task 3
main performing task 4
main performing task 5
main performing task 6
main performing task 7
main performing task 8
main performing task 9
main performing task 10
Main thread performing when Serena is in state RUNNABLE
Main thread performing when Serena is in state TIMED_WAITING
Main thread performing when Serena is in state TIMED_WAITING
Main thread performing when Saniya is in state TIMED_WAITING
Main thread performing when Saniya is in state TIMED_WAITING
Main thread performing when Saniya is in state TIMED_WAITING
Main thread performing when Maria is in state TIMED_WAITING
Main thread performing when Maria is in state TIMED_WAITING
Main thread performing when Maria is in state TIMED_WAITING
This is being executed from the main function and all the threads have been suspended.
State of Saniya: TIMED_WAITING
State of Maria: TIMED_WAITING
State of Serena: TIMED_WAITING
Saniya is RUNNABLE
Saniya performing task 1
Saniya performing task 2
Saniya performing task 3
Saniya performing task 4
Saniya performing task 5
Saniya performing task 6
Saniya performing task 7
Saniya performing task 8
Saniya performing task 9
Saniya performing task 10
Serena is RUNNABLE
Serena performing task 1
Serena performing task 2
Serena performing task 3
Serena performing task 4
Serena performing task 5
Serena performing task 6
Serena performing task 7
Serena performing task 8
Serena performing task 9
Serena performing task 10
Maria is RUNNABLE
Maria performing task 1
Maria performing task 2
Maria performing task 3
Maria performing task 4
Maria performing task 5
Maria performing task 6
Maria performing task 7
Maria performing task 8
Maria performing task 9
Maria performing task 10
All the created threads have been executed. Now the program ends
 */