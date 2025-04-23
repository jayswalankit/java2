
import java.util.*;
public class bike extends Vehicle {
     bike(int speed,String fuel){
        super(speed, fuel);
     }
     public void displayInfo(){
        System.out.println(speed);
        System.out.println(fuel);
     }
     public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
         System.out.println("enter speed");
         int speed=sc.nextInt();
         sc.nextLine();
         System.out.println("enter your fuel");
         String fuel=sc.nextLine();

         bike obj=(new bike(speed, fuel));
         obj.displayInfo();
     }
}
