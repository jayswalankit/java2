import java.util.*;

class InsufficentException extends Exception{
    public   InsufficentException (String messege){
        super(messege);
    }
}
public class BankAccount {
    private String accountno;
    private double balance;

    BankAccount(String accountno,double balance){
        this.accountno=accountno;
        this.balance=balance;

    }
     public void setAccountno(String accountno ){
        this.accountno=accountno;
     }
     public String getAccountno(){
        return accountno;
     }

     public void setBalance(double balance){
        this.balance=balance;
     }

     public double getBalance(){
        return balance;
     }
    
     public void deposit(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your  yoy want to deposit");
        double  amount=sc.nextDouble();

        balance+=amount;
       try {
        if(amount<=0){
            throw new InsufficentException("Amount is not available");
          }
          else{
              System.out.println(getBalance());
          }
       } catch (Exception e) {
     System.out.println(e.getMessage());
       }
     }

     public void withdraw(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your amount you want to withdraw");
        double  amount=sc.nextDouble();

        balance-=amount;
        try {
            if(balance<0&&amount>balance){
                throw new InsufficentException("Amount is not available");
              }
              else{
                  System.out.println(getBalance());
              }
           } catch (Exception e) {
         System.out.println(e.getMessage());
           }
         }
    
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BankAccount obj=new BankAccount(null, 0);
        System.out.println("enter your Account no");
        obj.setAccountno(sc.nextLine());
        System.out.println("enter your balance");
        obj.setBalance(sc.nextDouble());

        obj.getAccountno();
        obj.deposit();
        obj.withdraw();


     }
    }


