import java.util.*;
public class merging {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your size");
        int n=sc.nextInt();
          int [] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter your size");
        int n1=sc.nextInt();
          int [] arr1=new int[n1];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }

        int n2=n+n1;
        int [] arr2=new int[n2];
        for(int i=0;i<arr.length;i++){
            arr2[i]=arr[i];
        }

        for(int i=0;i<arr1.length;i++){
            arr2[n+i]=arr1[i];
        }

        System.out.println("result");
        for(int i=0;i<arr2.length;i++){
           
            System.out.println(arr2[i]);
        }
       
    }
}
