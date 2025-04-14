import java.util.*;

public class Two {
    public static void main(String[] args) {
        ArrayList<Integer> accessing = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
          accessing.add(sc.nextInt());
        }
      System.out.println(accessing.get( 2));
    }
}
