import java.util.*;

public class Additional {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your size");
        int n=sc.nextInt();
        String []element=new String[n];
        System.out.println("enter your element");
        for(int i=0;i<n;i++){
            element[i]=sc.next();
        }
        for(int i=0;i<element.length;i++){
            for(int j=i+1;j<element.length;j++){
            String tem=element[i];
            element[i]=element[j];
            element[j]=tem;


            }
            System.out.println(element[i]);
        }
    }
}
