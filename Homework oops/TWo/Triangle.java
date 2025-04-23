
import java.util.*;
public class Triangle  extends  Shape {
    int base;
    int height;
    public double area(){
        Scanner sc=new Scanner(System.in);
       System.out.println("enter your base ");
        base=sc.nextInt();
         System.out.println("enter your height");
         height=sc.nextInt();
         return  0.5*height*base;
      
    }

    public double area(int base,int height){
         return  0.5*height*base;
      
    }
    public static void main(String[] args) {
         Triangle obj=new Triangle();
        System.out.println(obj.area());
    }
    
}
