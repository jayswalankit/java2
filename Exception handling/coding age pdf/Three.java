import java.io.FileReader;

class FileMissing extends Exception{
    public FileMissing (String messege){
        super(messege);
    }
}
public class Three {
    public static void readFile (String fileName)throws FileMissing {
        try{
            FileReader fr=new FileReader("ABC.txt");
            System.out.println("open");
        }
        catch(Exception e){
         throw new FileMissing(fileName);
        }
    }
    public static void main(String[] args) {
        String FileMissing="ABC.txt";
        try{
            readFile(FileMissing);
        }
    catch(Exception e){
       System.out.println("custom exception"+e.getMessage());
    }
    }
}
