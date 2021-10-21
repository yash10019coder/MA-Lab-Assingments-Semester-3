package _5_.threadPkg;

public class Thread3 implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("****Work " + i + " completed by " + Thread.currentThread().getName() + "****\n");
            try {
                Thread.currentThread().sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
