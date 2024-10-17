class MyThread extends Thread {
    public void run() {
        System.out.println("Hello World from Thread class");
    }
}

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Hello World from Runnable interface");
    }
}

public class PRACT32 {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        thread1.start();

        MyRunnable myRunnable = new MyRunnable();
        Thread thread2 = new Thread(myRunnable);
        thread2.start();
    }
}
