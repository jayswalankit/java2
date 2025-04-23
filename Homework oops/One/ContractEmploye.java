
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
        public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
       
           System.out.println("enter your name");
           String name=sc.nextLine();
       
          permanentemploye obj=new permanentemploye();
       
          System.out.println("enter your id");
          int id=sc.nextInt();
       
          System.out.println("enter your salary");
          obj.salary=sc.nextFloat();
       
           
            obj.calculatebonus();
        }
       }
       

