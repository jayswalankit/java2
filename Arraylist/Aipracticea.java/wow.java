
import java.util.*;
public class wow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String>name=new ArrayList<>();
        System.out.println("enter your name");
        for(int i=0;i<5;i++){
            name.add(sc.nextLine());
          
        }
        Collections.sort(name);
           System.out.println(name);
       
    }
}
