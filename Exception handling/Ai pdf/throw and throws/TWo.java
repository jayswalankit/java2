import java.util.*;

public class TWo {
    
    public static void numbers(int a,int b)throws IllegalArgumentException,ArrayIndexOutOfBoundsException{
         if(a==0&&b==0){
            throw new IllegalArgumentException("make a and b positive");
        }
        if(b==0){
            throw new ArithmeticException("Division by zero is not allowed");
          }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        System.out.println("enter no");
        int a=sc.nextInt();
        int b=sc.nextInt();

        try {
            numbers(a, b);
            
            System.out.println("divided");

           
        } catch (ArithmeticException e) {
           System.out.println("make b non zero");
        }

        catch(IllegalArgumentException e){
           System.out.println(e.getMessage());
        }
    }
}
