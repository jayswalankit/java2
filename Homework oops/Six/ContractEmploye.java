
import java.util.*;
public class ContractEmploye extends Employe {
    
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
         System.out.println("Your name: "+name);
         System.out.println("your id: "+id);
         System.out.println("Your salary: "+salary);
         calculatebonus();
      }
        public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           ContractEmploye obj=new ContractEmploye();
       
           System.out.println("enter your name");
           obj. name=sc.nextLine();
       
        
       
          System.out.println("enter your id");
          obj. id=sc.nextInt();
       
          System.out.println("enter your salary");
          obj.salary=sc.nextFloat();
       
           
            obj.display();
        }
       }
       

