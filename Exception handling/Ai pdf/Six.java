import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Six {
    


    public static void hello()throws FileNotFoundException{
     
         FileReader fr = new FileReader("abc.txt");
    }
    public static void main(String[] args) {
       try{
           hello();
       }
       catch(Exception e){
           System.out.println(e);
       }
    }
}

