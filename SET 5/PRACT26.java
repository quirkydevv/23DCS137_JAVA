class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class PRACT26 {
    
    static void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age is less than 18. Access denied.");
        } else {
            System.out.println("Access granted.");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (AgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
        
        try {
            checkAge(20);
        } catch (AgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
