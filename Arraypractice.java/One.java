
import java.util.*;
public class One {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
           
        System.out.println("Enter your size");
        int n=sc.nextInt();

       int [] arr=new int[n];
       System.out.println("Enter your element");
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }

       System.out.println("enter no of element to rotate");
       int k=sc.nextInt();

       k=k%n;
       int [] rotate=new int[n];
       for(int i=0;i<n;i++){
        rotate[(i+k)%n]=arr[i];
        
        System.out.println("ans");
        for(int wow:rotate){
            System.out.println(wow);
        }
       }

    }
}



