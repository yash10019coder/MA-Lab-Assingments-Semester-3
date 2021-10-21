package _4_;

class ThreadExample implements Runnable {
    static Thread MAIN;

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is performing task " + i + " and thread "
                    + MAIN.getName() + " is " + MAIN.getState());
            try {
                Thread.currentThread().sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class DaemonExample {
    public static void main(String args[]) throws Exception {
        ThreadExample.MAIN = Thread.currentThread();
        ThreadExample obj = new ThreadExample();
        Thread t1 = new Thread(obj, "Thread1");
        Thread t2 = new Thread(obj, "Thread2");
        Thread t3 = new Thread(obj, "Thread3");
        System.out.println(
                "This code illustrates how the non daemon threads perform all the tasks while the daemon thread dies before completing the tasks, when all the non daemon threads have terminated:");
        t3.setDaemon(true);
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();

    }
}
/*
ubuntu@ubuntu-linux:~/Documents/college/AdvancedJavaMA/Assignment6$  cd /home/ubuntu/Documents/college/AdvancedJavaMA/Assignment6 ; /usr/bin/env /usr/lib/jvm/java-11-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /home/ubuntu/.config/Code/User/workspaceStorage/0e7b35696775f25fd31f418aae959ecd/redhat.java/jdt_ws/Assignment6_449183e8/bin _4_.DaemonExample 
This code illustrates how the non daemon threads perform all the tasks while the daemon thread dies before completing the tasks, when all the non daemon threads have terminated:
Thread1 is performing task 1 and thread main is WAITING
Thread1 is performing task 2 and thread main is WAITING
Thread1 is performing task 3 and thread main is WAITING
Thread1 is performing task 4 and thread main is WAITING
Thread1 is performing task 5 and thread main is WAITING
Thread2 is performing task 1 and thread main is WAITING
Thread2 is performing task 2 and thread main is WAITING
Thread2 is performing task 3 and thread main is WAITING
Thread2 is performing task 4 and thread main is WAITING
Thread2 is performing task 5 and thread main is WAITING
Thread3 is performing task 1 and thread main is TERMINATED
*/