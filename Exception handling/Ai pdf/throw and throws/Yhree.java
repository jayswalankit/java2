import java.util.*;

public class Yhree {
    public static void checkstring(String str){
        if( str==null){
            throw new NullPointerException("String has no size");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str = sc.nextLine();

        try {
            checkstring(null);
        } catch (NullPointerException e) {
          System.out.println("hello");
        }
    }
}
