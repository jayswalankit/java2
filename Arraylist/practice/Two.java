import java.util.*;

public class Two {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your size");
        int n=sc.nextInt();
        System.out.println("Enter your numbers");
        for(int i=0;i<n;i++){
            numbers.add(sc.nextInt());
        }
        
        Collections.addAll(numbers,60,78,889,98,777,67);
        for(int i=0;i<numbers.size();i++){
            System.out.println(numbers);
        }
    }


    // add multiple value using this method....
}
