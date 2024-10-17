import java.util.Scanner;
class PRACT3{
public static void main(String args[]) 
{
    int h, M, s;
    int distance;
    Scanner S1 = new Scanner(System.in);

    System.out.println("Enter the distance travelled by user in meter:");
    distance = S1.nextInt();
    
    System.out.println("Enter the time in hours:");
    h = S1.nextInt();
    
    System.out.println("Enter the time in minutes:");
    M = S1.nextInt();
    
    System.out.println("Enter the time in seconds:");
    s = S1.nextInt();

    int totalSeconds = (h * 3600) + (M * 60) + s;

    if (totalSeconds > 0) 
{
        double Mpersec = (double) distance / totalSeconds;
        double KmPerHr = Mpersec * 3.6;
        double MilesPerHr = Mpersec * (3.6/1.609);
        System.out.printf("The speed of the vehicle is %.2f m/s%n", Mpersec);
        System.out.printf("The speed of the vehicle is %.2f km/hr%n", KmPerHr);
        System.out.printf("The speed of the vehicle is %.2f miles/hr%n", MilesPerHr);
    } else {
        System.out.println("Invalid time. Time should be greater than 0.");
    }
}
}