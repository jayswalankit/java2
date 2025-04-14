import java.util.*;

public class Three {
      public static void main(String[] args) {
    
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 integers:");

    
        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            // numbers.add(scanner.nextInt());
            numbers.add(num);
           
        }
        numbers.add(2, 5);
    
        System.out.println("The list of integers is:");
        for (int number : numbers) {
            System.out.println(number);
        }

        
    }
}

