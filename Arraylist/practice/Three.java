
import java.util.*;
public class Three {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>numbers=new ArrayList<>();
        System.out.println("enter your no");
        int n=sc.nextInt();
        System.out.println("enter your no");
        for(int i=0;i<n;i++){
            numbers.add(sc.nextInt());
        }
        Iterator <Integer>iterator=numbers.iterator();
            
        for(int i=0;i<numbers.size();i++){
            System.out.println(iterator.hasNext());
        }
     

    }
}

