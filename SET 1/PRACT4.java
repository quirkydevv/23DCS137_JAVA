
import java.util.Scanner;

public class PRACT4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int NumDays;

        double totalExpenses = 0.0;
        System.out.println("Enter the number of days in the month: ");
        NumDays = scanner.nextInt();
       
        for (int i = 1; i <= NumDays; i++) {
           
            System.out.println("Enter expenses for day : $" + i);
            double dailyExpense = scanner.nextDouble();
            totalExpenses += dailyExpense;
        }

        scanner.close();

        System.out.printf("Total expenses for the month: $%.2f\n", totalExpenses);
    }
}
