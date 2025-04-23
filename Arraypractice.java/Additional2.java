
import java.util.*;

public class Additional2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner (System.in);

        System.out.println("enter your size");

        int n=sc.nextInt();

        int [] arr=new int[n];
// taking user input.....
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }

        System.out.println("enter how many no you want to rotate");

        int rotateno=sc.nextInt();


        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(i<rotateno){
                    int tem=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tem;
                
                  }
            }
          System.out.println(arr[i]);
        }
    }
}
