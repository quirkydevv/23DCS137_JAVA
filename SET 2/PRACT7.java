public class PRACT7 { 
    
     static int Choco(String s, int a) 
{
    String S1 = s.substring(0, 3);
    for (int i = 0; i < a; i++) {
        System.out.print(S1);  
    }
    System.out.println();
    return 0; 
}

public static void main(String args[]) {
    Choco("Chocolate", 3);
    Choco("Chocolate", 2);
    Choco("Abc", 3);
}
}
