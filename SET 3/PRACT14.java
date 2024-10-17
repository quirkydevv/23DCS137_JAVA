import java.util.Scanner;
class Date
 
{
    int year;
    int month;
    int day;
    Scanner S1 = new Scanner(System.in);

    void getDate()
    {
        System.out.println("Enter the Date:");

        day=S1.nextInt();
    }
    void getMonth()
    {
        System.out.println("Enter the Month:");
        month=S1.nextInt();
    }
    void getYear()
    {
        System.out.println("Enter the Year:");
        year=S1.nextInt();
    }
    void displayDate()
    {
        System.out.println( "Your output is:" + day+"/"+month+"/"+year);

    }
    Date(int d,int m ,int y)
    {
        day=d;
        month=m;
        year=y;
    }
    Date()
    {

    }
}
class PRACT14 
{
    public static void main(String[] args) 
    {   

        Date d2 = new Date(29,10,2004);
        Date d1 = new Date(0,0,0);
        d1.getDate();
        d1.getMonth();
        d1.getYear();
        d1.displayDate();
        d2.displayDate();
    }
}



