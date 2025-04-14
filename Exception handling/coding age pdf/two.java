import java.util.*;

public class two {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your no");
        int n=sc.nextInt();
        
       try {
        int a=n/3;
        System.out.println("Enter your array index you want");
        int ar=sc.nextInt();
        int [] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            
        }
       

  
       } catch (ArithmeticException e) {
       System.out.println(e);
       }
       catch(ArrayIndexOutOfBoundsException e){
          System.out.println(e);
       }
        

    }
}
