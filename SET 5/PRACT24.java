import java.util.*;

public class PRACT24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter the value of x: ");
            int x = scanner.nextInt();
            
            System.out.print("Enter the value of y: ");
            int y = scanner.nextInt();
            
    
            int result = x / y;
            System.out.println("Result: " + result);
            
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        scanner.close();
    }
}
