
import java.util.*;
public class Two {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your size;");
    int n=sc.nextInt();
    int[]arr=new int[n];
    for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
    }
    label: for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                continue label;
            }
            
        }
        System.out.println("result");
        System.out.println(arr[i]);
    }
   } 
}
