import java.util.*;

public class Two {
    public static void main(String[] args) {
       
        try {
            int[]arr=new int[5];
            for(int a:arr){
                
                  System.out.println(arr[10]);
            }
        } catch (Exception e) {
        System.out.println("the exception is "+e);
        }

        try {
            String str=null;
            System.out.println("length"+str.length());
        } catch (Exception e) {
        System.out.println("the esception is"+e.getMessage());
        }

        String a="abc123";
        try {
            int d=Integer.parseInt(a);
        } catch (Exception e) {
          System.out.println("the exception is" + e);
        }
     
    }
}
