import java.util.*;

public class One {
    public static void main(String[] args) {
        
        try{
            int a=12;
            int b=a/0; 
        }
        catch(Exception e){
           System.out.println("the excepton is"+e);
        }
        
        try {
            String a="&";
            Integer b=Integer.parseInt(a);
        } catch (Exception e) {
           System.out.println("the exception is"+e);
        }

        try{
            int v=123;
            String str=String.valueOf(v);
   
        }
        catch(Exception e){
            System.out.println("the exception is"+e);
        }
        
    }
}
