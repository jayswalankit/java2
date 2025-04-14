
import java.util.*;
public class Five {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>numbers=new ArrayList<>();
        System.out.println("enter your no");
        int n=sc.nextInt();
        System.out.println("enter your element");
         int a=sc.nextInt();
         for(int i=0;i<n;i++){
            numbers.add(sc.nextInt());
         }   
         Integer[]arr=numbers.toArray(new Integer[numbers.size()])  ;  
    }
}
