
import java.util.*;
public class two {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your String");
        String str=sc.nextLine();

        str=str.toLowerCase();

        String rev ="";
        // String rev;
        
        
        for(int i=str.length()-1;i>=0;i--){
             rev += str.charAt(i);
        }
       
        if(str.equals(rev)){
             System.out.println("Yes Palindrome");
        }
        else{
            System.out.println("NO, It's not a Palindrome");
        }
    }
}







