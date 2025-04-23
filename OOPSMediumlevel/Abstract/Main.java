
import java.util.*;
 abstract class Appliance {
    abstract void operate();
}
 class WashingMachine extends Appliance{
   public void operate(){
    System.out.println("washing clothes");
   }
}

class Microwave extends Appliance{
    public void operate(){
     System.out.println("Heating food");
    }
 }

 public class Main {
   public static void main(String[] args) {
       Appliance obj=new WashingMachine();
       obj.operate();

       Appliance obj1=new Microwave();
       obj.operate();;
   }
 }
