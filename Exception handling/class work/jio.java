import java.util.Scanner;

public class jio {
    public static void main(String[] args) {
        // Example usage of checkAge method
        checkAge(12);
    }

    public static void checkAge(int Age) {
        if (Age < 18) {
            throw new ArithmeticException("Can't vote");
            
        } else {
            System.out.println("Can vote");
        }
       
    }
    
}
