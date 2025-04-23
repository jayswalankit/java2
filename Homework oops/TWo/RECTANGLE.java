import java.util.*;

public class RECTANGLE extends  Shape {
    Scanner sc=new Scanner(System.in);
    int length;
    int breadth;
    public double area(){
        Scanner sc=new Scanner(System.in);
       System.out.println("enter your length ");
        length=sc.nextInt();
         System.out.println("enter your breadth");
         breadth =sc.nextInt();
         return length*breadth;
      
    }
    public double area(int length,int breadth){
        return length*breadth;
    }
    public static void main(String[] args) {
         RECTANGLE obj=new RECTANGLE();
        System.out.println(obj.area());
    }
}
