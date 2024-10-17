import java.util.Scanner;

class PRACT6 
{
    public static void main(String args[])
    {
        long sum = 0;
	long c;
        System.out.println("Enter the number of terms:");
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        long a = 0;
        long b = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++)
        {
            System.out.print(a + " ");
            sum += a;
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println("\nSum of Fibonacci Series: " + sum);
    }
}
