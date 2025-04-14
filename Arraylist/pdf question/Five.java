import java.util.*;

public class Five{
    public static void main(String[] args) {
        ArrayList<Integer> sort=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");
        for(int i=0;i<5;i++){
            sort.add(sc.nextInt());
            Collections.sort(sort);
        }
        System.out.println("Numbers in arranged form");
        for(int number:sort){ 
            System.out.println( number);
        }
    }
}