import java.util.*;

public class Four {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("enter your size of 1st array;");
    int n=sc.nextInt();
    int[]arr=new int[n];
    for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
    }

    System.out.println("enter your size of 2nd array;");
    int n1=sc.nextInt();
    int[]arr1=new int[n];
    for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
    }

    int []merge=new int[n+n1];
    for(int i=0;i<n1;i++){
        merge[i]=arr[i];
    }
   
   
} 
    }

