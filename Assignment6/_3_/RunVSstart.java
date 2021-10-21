package _3_;

class ExampleThread implements Runnable {
    public void run() {
        System.out.println("This is thread: " + Thread.currentThread().getName());
    }
}

public class RunVSstart {
    public static void main(String args[]) {
        ExampleThread et = new ExampleThread();
        Thread t1 = new Thread(et);
        Thread t2 = new Thread(et);
        t1.setPriority(10);
        t2.setPriority(10);
        System.out.println(
                "If directly run method is called then no new thread is formed and and it is simply like a function call from the stack of current thread");
        System.out.println(
                "If start method is called then a new thread is formed and a new stack is allocated to that thread from where the execution of the task occurs");
        System.out.println("----------Directly calling run method-----------");
        t1.run();
        System.out.println("----------Calling start method-------------");
        t1.start();
    }
}
/*
 * Output buntu@ubuntu-linux:~/Documents/college/AdvancedJavaMA/Assignment6$ cd
 * /home/ubuntu/Documents/college/AdvancedJavaMA/Assignment6 ; /usr/bin/env
 * /usr/lib/jvm/java-11-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp
 * /home/ubuntu/.config/Code/User/workspaceStorage/
 * 0e7b35696775f25fd31f418aae959ecd/redhat.java/jdt_ws/Assignment6_449183e8/bin
 * _3_.RunVSstart If directly run method is called then no new thread is formed
 * and and it is simply like a function call from the stack of current thread If
 * start method is called then a new thread is formed and a new stack is
 * allocated to that thread from where the execution of the task occurs
 * ----------Directly calling run method----------- This is thread: main
 * ----------Calling start method------------- This is thread: Thread-0
 */