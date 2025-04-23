
import java.util.*;
 class Engine {
    String engineType;
    String engineName;
}

public class Car {
    String  carName;
    Engine engine;

    public void setCarname(String carName){
        this.carName=carName;
    }
    public void setEngine(String engineType,String engineName){
        this.engine=new Engine();
        this.engine.engineType=engineType;
        this.engine.engineName=engineName;
    }

    public void display(){
        System.out.println("Car name: "+carName);
        System.out.println("Engine type: "+engine.engineType);
        System.out.println( "Engine number: "+engine.engineName);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Car obj=new Car();
        System.out.println("enter your Car name");
       obj.setCarname(sc.nextLine());
       System.out.println("Enter your Engine detail");
        obj.setEngine(sc.nextLine(),sc.nextLine());
          obj.display();
       
    }
}
