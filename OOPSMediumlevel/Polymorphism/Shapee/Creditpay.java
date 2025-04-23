public class Creditpay extends Payment {
    public void transactionway(){
        System.out.println("Credit card");
    }
    public static void main(String[] args) {
        Payment obj=new Creditpay();
         obj.transactionway();
    }
}
