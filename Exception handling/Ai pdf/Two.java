
import java.util.*;
public class Two {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your size of array");
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        try {
            System.out.println("enter the no of index you want to see");
            int a=sc.nextInt();
            System.out.println(arr[a]);
        } catch (Exception e) {
          System.out.println(e);
        }

    }
}
