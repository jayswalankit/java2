import java.util.ArrayList;
import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        ArrayList<Integer>removing=new ArrayList<>();
         Scanner sc=new Scanner(System.in);
         for(int i=0;i<5;i++){
            int number =sc.nextInt();
            removing.add(number);
         }
        removing.remove(2);
        for(int number:removing){
            
            System.out.println(number);
        }
    }

}
