
class FirstThread extends Thread {
    public void run() {
        System.out.println("First " + getPriority());
    }
}


class SecondThread extends Thread {
    public void run() {
        System.out.println("Second " + getPriority());
    }
}


class ThirdThread extends Thread {
    public void run() {
        System.out.println("Third " + getPriority());
    }
}

public class PRACT36 {
    public static void main(String[] args) {
        
        FirstThread f = new FirstThread();
        SecondThread s = new SecondThread();
        ThirdThread t = new ThirdThread();
        
   
        f.setPriority(8);
        s.setPriority(4);
        t.setPriority(6);
        
        f.start();
        s.start();
        t.start();

      

    }
}
