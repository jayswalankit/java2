import java.util.*;

public class Person
 {
   String name;
   int age;
   @Override
   public String toString(){
    return "My name is "+name+" My age is "+age;

   } 
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Person obj=new Person();
    
        System.out.println("enter your name");
        obj.name=sc.nextLine();
        System.out.println("Enter your Age");
        obj.age=sc.nextInt();

        System.out.println(obj);
   }
}
