package _5_;

import _5_.threadPkg.*;

public class Main {
    public static void main(String args[]) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();
        ThreadGroup tg = new ThreadGroup("Parent");
        Thread tt1 = new Thread(tg, t1, "thread_1");
        Thread tt2 = new Thread(tg, t2, "thread_2");
        Thread tt3 = new Thread(tg, t3, "thread_3");

        System.out.println("Before starting any thread, no. of active threads = " + tg.activeCount() + "\n");
        tt1.start();
        tt2.start();

        System.out.println("After starting two threads, no. of active threads = " + tg.activeCount() + "\n");
        tt3.start();

        System.out.println("No of thread groups for which thread group " + tg.getName() + " is parent are: "
                + tg.activeGroupCount() + "\n");

        tg.checkAccess();
        System.out.println(tg.getName() + " has access.\n");

        System.out.println("Parent of the the thread group " + tg.getName() + " is " + tg.getParent().getName() + "\n");

        System.out.println("Information about the thread group " + tg.getName() + ":");
        tg.list();

        System.out.println();

        System.out.println("---Stopping all the threads of the thread group " + tg.getName() + " ---\n");
        tg.stop();

        try {
            tt1.join();
            tt2.join();
            tt3.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Destroying all the threads \n");
        tg.destroy();

        System.out.println("Have all the threads been destroyed?: " + tg.isDestroyed());

    }

}
/**
 * Output: ubuntu@ubuntu-linux:~/Documents/college/AdvancedJavaMA/Assignment6$
 * cd /home/ubuntu/Documents/college/AdvancedJavaMA/Assignment6 ; /usr/bin/env
 * /usr/lib/jvm/java-11-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp
 * /home/ubuntu/.config/Code/User/workspaceStorage/0e7b35696775f25fd31f418aae959ecd/redhat.java/jdt_ws/Assignment6_449183e8/bin
 * _5_.Main Before starting any thread, no. of active threads = 0
 **** 
 * Work 1 completed by thread_1****
 * 
 * After starting two threads, no. of active threads = 2
 **** 
 * Work 1 completed by thread_2****
 * 
 * No of thread groups for which thread group Parent is parent are: 0
 **** 
 * Work 1 completed by thread_3****
 * 
 * Parent has access.
 * 
 * Parent of the the thread group Parent is main
 * 
 * Information about the thread group Parent:
 * java.lang.ThreadGroup[name=Parent,maxpri=10] Thread[thread_1,5,Parent]
 * Thread[thread_2,5,Parent] Thread[thread_3,5,Parent]
 * 
 * ---Stopping all the threads of the thread group Parent ---
 * 
 * Destroying all the threads
 * 
 * Have all the threads been destroyed?: true
 */