public class Paypal  extends Payment{
    public void transactionway(){
        System.out.println("Paypal");
    }
    public static void main(String[] args) {
        Payment obj=new Paypal();
        obj.transactionway();
    }
}
