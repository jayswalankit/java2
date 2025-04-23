
import java.util.*;
abstract  class Shape {
     public abstract double area();
}

public class Circle extends Shape{
     Scanner sc=new Scanner(System.in);
 double radius;
 public double area(){
    System.out.println("enter your area");
   radius=sc.nextDouble();
   return Math.PI*radius*radius;
 }
 public double area(double radius){
     
    return Math.PI*radius*radius;
  }

 public static void main(String[] args) {
      Circle obj=new Circle();
     System.out.println(obj.area());
 }
}
