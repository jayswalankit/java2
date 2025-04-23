
import java.util.*;
public class one {
  int id;
  String name;
  float salary;  
  public one(int id,String name,float salary){
    this.id=id;
    this.name=name;
    this.salary=salary;
  }
  public void update(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your amount you want to update");
    float amount=sc.nextInt();
    System.out.println(amount);
    salary+=amount;
    System.out.println(salary+"updated");
  }
  public void display(){
    System.out.println("result");
       System.out.println(id);
       System.out.println(name);
       System.out.println(salary);
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
   
    System.out.println("Enter your name");
    String name=sc.nextLine();
    System.out.println("Enter your id");
    int id=sc.nextInt();
    System.out.println("Enter your salary");
    float salary=sc.nextFloat();
    one obj=new one(id, name, salary);
    obj.update();
   obj.display();

  }
}
