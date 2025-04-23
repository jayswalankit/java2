
import java.util.*;
public class Logging {
    String welcome;
   
   
    public String toString(){
        return "Welcome to page "+welcome;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Logging obj=new Logging();
        System.out.println("Enter your messege");
        obj.welcome=sc.nextLine();
        System.out.println(obj);
    }
}
