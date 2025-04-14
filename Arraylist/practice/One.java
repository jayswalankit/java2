import java.util.*;

public class One {
   public static void main(String[] args) {
    ArrayList<Integer>numbers=new ArrayList<>();
    Scanner sc=new Scanner (System.in);
    System.out.println("enter your size");
    int n=sc.nextInt();
    System.out.println("enter your no");
    for(int i=0;i<n;i++){
        int a=sc.nextInt();
        numbers.add(a);
    }
    System.out.println(numbers);
   } 
}
