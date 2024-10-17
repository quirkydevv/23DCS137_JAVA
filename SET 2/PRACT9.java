 public class PRACT9 {
    public static void main(String[] args) {
        System.out.println(doubleChar("The"));        
        System.out.println(doubleChar("AAbb"));       
        System.out.println(doubleChar("Hi-There"));   
    }

    public static String doubleChar(String str) {
        String doubledStr = "";  // Initialize an empty string to store the result

       
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);  // Get the current character

            
            doubledStr += c + "" + c;
        }

        return doubledStr; 
    }
}
    

