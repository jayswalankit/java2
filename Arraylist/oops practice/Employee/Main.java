import java.util.*;

class Employe {
    String name;
    int id;
 
      Employe(String name,int id){
        this.name=name;
        this.id=id;
     
      }
    public void CalculateSalary(){
        System.out.println(name);
    }
}
class FullTimeEmployee extends Employe{
    float salary;
        FullTimeEmployee(String name,int id,float salary){
            super(name, id);
            this.salary=salary;
        }
        @Override
        public void CalculateSalary(){
            System.out.println(name+salary);
        }
}

class PartTimeEmployee extends Employe{
    float salary;
        PartTimeEmployee(String name,int id,float salary){
            super(name, id);
            this.salary=salary;
        }
        @Override
        public void CalculateSalary(){
            System.out.println(name+salary);
        }
}

public class Main {
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    ArrayList<Employe> worker=new ArrayList<>(); 
    System.out.println("enter no of full time employee");
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
      System.out.println("enter your name");
      String name=sc.nextLine();
      System.out.println("enter your id");
      int id=sc.nextInt();
    }
  }


}

