import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;


public class iter {
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(2);
        arr.add(3);
        arr.add(4);
        Iterator <Integer>a=arr.iterator();
        try {
            a.remove();
        } catch (Exception e) {
         System.out.println("exception"+e);
        }
    }
}
