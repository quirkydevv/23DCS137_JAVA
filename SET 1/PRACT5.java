import java.util.Scanner;
public class PRACT5 {
    public static void main(String args[]) {
       
     Scanner S1 = new Scanner(System.in);

        System.out.println("Enter the product code:");
        int productCode = S1.nextInt();

        System.out.println("Enter the price:");
        double price = S1.nextDouble();

        double tax = 0;
        switch (productCode) {
            case 1:
                tax = price * 0.08; 
                break;
            case 2:
                tax = price * 0.12; 
                break;
            case 3:
                tax = price * 0.05; 
                break;
            case 4:
                tax = price * 0.075;
                break;
            default:
                tax = price * 0.03; 
}

        double totalPrice = price + tax;
        
        System.out.println("Price: " + price);
        System.out.println("Tax: " + tax);
        System.out.println("Total Price: " + totalPrice);
    }
}