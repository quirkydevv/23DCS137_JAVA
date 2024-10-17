import java.util.Scanner;

class Square extends Thread {
    int number;
    
    Square(int number) {
        this.number = number;
    }
    
    public void run() {
        System.out.println("Square of " + number + " is: " + (number * number));
    }
}

class Cube extends Thread {
    int number;
    
    Cube(int number) {
        this.number = number;
    }
    
    public void run() {
        System.out.println("Cube of " + number + " is: " + (number * number * number));
    }
}

public class PRACT34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputs = new int[10];
        
       
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            inputs[i] = scanner.nextInt();
        }
        
 
        for (int i = 0; i < 10; i++) {
            if (inputs[i] % 2 == 0) {
                Square s = new Square(inputs[i]);
                s.start();
            } else {
                Cube c = new Cube(inputs[i]);
                c.start();
            }
            
            try {
              
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
            }
        }

        scanner.close();
    }
}
