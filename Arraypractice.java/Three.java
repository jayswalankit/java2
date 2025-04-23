import java.util.*;

public class Three {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your size;");
    int n=sc.nextInt();
    int[]arr=new int[n];
    for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
    }
    int max=-999999,secondmax=-9999999;
     for(int i=0;i<arr.length;i++){
        
       
        System.out.println(arr[i]);
    }

    for(int i=0;i<n;i++){
        if(arr[i]>max){
            max=arr[i];
        }

        // if(arr[i]>secondmax&&arr[i]<max){
        //     secondmax=arr[i];
        // }
    }

    for(int i=0;i<n;i++){
        

        if(arr[i]>secondmax&&arr[i]<max){
            secondmax=arr[i];
    }
   }    
   System.out.println("result");
   System.out.println(secondmax);
}
}
