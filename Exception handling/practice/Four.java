import java.io.IO;
import java.io.IOException;

public class Four {
    public static void main(String[] args) {
       
        try {
            int a=5;
            int b=0;
            int c;
             c=a/b;
             System.out.println("hello");
        } catch (ArithmeticException e) {
           System.out.println(e);
        }
        
    }
}
