
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(int balance) {
        super("Insufficient balance: " + balance);
    }
}

class cash extends Exception {
    public cash(String messege) {
        super(messege);
    }
}
public class Five {
    private int balance;

     public Five(int balance){
        this.balance=balance;
     }

     public void withdraw(int amount) throws InsufficientBalanceException {
        if(balance<amount){
            throw new InsufficientBalanceException(balance);
            
        }
       

     }

         public static void main(String[] args) {
        Five obj = new Five(5000);
        try {
            obj.withdraw(6000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
     }
}
