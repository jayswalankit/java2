import java.util.ArrayList;
import java.util.Scanner;
public class Arraylistconversion {
    public static void main(String[] args) {
        ArrayList<Integer>conversion=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your size");
        int n=sc.nextInt();
        System.out.println("enter your element");
        for(int i=0;i<n;i++){
          conversion.add(sc.nextInt());
        }
        
            Integer[] arr = conversion.toArray(new Integer[conversion.size()]);
           
        
        System.out.println("result :--------------->");
      for(int number:arr){
        System.out.println(number);
      }
    }
}
