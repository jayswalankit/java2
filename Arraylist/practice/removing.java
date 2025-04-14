import java.util.*;

public class removing {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your size");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            numbers.add(sc.nextInt());
        }
        // numbers.remove(3);
    //     Collections.reverse(numbers);
    //     Collections.max(numbers);
    //    Collections.swap(numbers, 0, numbers.size() - 1); 
        // boolean a= numbers.contains(3);
        // numbers.hashCode();
           numbers.get(0);
           Collections.swap(numbers, 0, n-1);
        Collections.addAll(numbers, 10, 11);
        numbers.add(5, 100);
        System.out.println(numbers);
      
        // System.out.println(a);
        
    }
}
