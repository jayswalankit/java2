
import java.util.*;
public class Account {
     private String name;
   private float balance;

   Account(String name,float balance){
     this.name=name;
     this.balance=balance;
   }
   public void setName(String name){
     this.name=name;
   }
   public String getName(){
     return name;
   }
   public void setBalance(float balance){
       this.balance=balance;
   } 
   public float getBalance(){
     return balance;
   }
      
   public void withdraw(){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter your amount you want to withdraw");
     float amount=sc.nextFloat();
         balance-=amount;
         if(balance>=0){
          System.out.println(balance);
         }
         else{
          System.out.println("Balance is not available");
         }
   }

   public void deposit(){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter your amount you want to deposit");
     float amount=sc.nextFloat();
         balance+=amount;
         if(balance>=0){
          System.out.println(balance);
         }
         else{
          System.out.println("Balance is not available");
         }
   }

   public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     Account obj=new Account(null, 0);
     System.out.println("Enter your name");
     obj.setName(sc.nextLine());
    
     System.out.println("Enter your balance");
     obj.setBalance(sc.nextFloat());

     System.out.println("result------------------->");
     System.out.println(obj.getName());
     System.out.println(obj.getBalance());

     obj.withdraw();
     obj.deposit();
   }



}
