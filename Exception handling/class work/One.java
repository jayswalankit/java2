import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class One {
    // public static void checkAge(int Age){
    // if(Age<18){
    // throw new ArithmeticException("Can't vote");
    // }
    // else{
    // System.out.println("Can vote");
    // }
    // }

    public static void readFile() throws IOException, FileNotFoundException {
        FileReader fr = new FileReader("abc.txt");
        FileReader fr1 = new FileReader("abc.txt");
        
    }

    public static void main(String[] args) {
        // int a=0;
        // int b=5;
        // int c=b/a;
        // System.out.println(c);

        // int [] arr={2,3,4,5};
        // System.out.println(arr[6]);

        // try{
        // FileReader fr=new FileReader("Abc.txt");
        // }
        // catch(FileNotFoundException e){
        // System.out.println("file not found");
        // }

        // checkAge(16);

        try {
            readFile();
        } catch (Exception e) {
            System.out.println("An I/O error occurred");
        }

        try {
            readFile();
        }

        catch (IOException e) {
           
            System.out.println("file not found");
        }

        finally{
            System.out.println("hello");
        }
    }

}

// e=variable