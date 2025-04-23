
import java.util.*;
abstract class Employe {
    String name;
    int id;
    float salary;

    abstract void calculatebonus();
}

public class Permanent extends Employe{
 public void calculatebonus(){

    Scanner sc=new Scanner(System.in);
    // System.out.println("entter your salary");
    // salary =sc.nextFloat();

    System.out.println("enter your bonus perentage");
    int bonuspercentage=sc.nextInt();

    float bonus=salary*bonuspercentage;
    System.out.println("your bonus: "+bonus);


   
 }

 public void display(){
    System.out.println("details---------------->");
    System.out.println(name);
    System.out.println(id);
    calculatebonus();
 }
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    Permanent obj=new Permanent();
    
    System.out.println("enter your name");
    obj. name=sc.nextLine();

   

   System.out.println("enter your id");
   obj. id=sc.nextInt();

   System.out.println("enter your salary");
   obj.salary=sc.nextFloat();

   obj.display();
    
    
 }
}

