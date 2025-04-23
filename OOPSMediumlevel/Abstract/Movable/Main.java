
import java.util.*;
 interface Movable {
      abstract void move();
}

class Car implements Movable{
   public void move(){
    System.out.println("car is moving");
   }
}

class Bike implements Movable{
    public void move(){
        System.out.println("Bike is moving ");
    }
}

class truck implements Movable{
    public void move(){
        System.out.println("truck is moving");
    }
}

public class Main{
    public static void main(String[] args) {
        Movable obj=new Car();
        obj.move();

        Movable obj1=new Bike();
        obj1.move();

        Movable obj2=new truck();
           obj2.move();
    }
}

