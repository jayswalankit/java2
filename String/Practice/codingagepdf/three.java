
import java.util.*;

public class three {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your a String.");
        String str=sc.nextLine();
            str=str.toLowerCase();
       StringBuilder str2 =new StringBuilder();

       for(int i=0;i<str.length();i++){
        char a=str.charAt(i);
       
        if(str2.indexOf(String.valueOf(a)) ==-1) {
            str2.append(a);
        }
       }
       System.out.println(str2);
    }
}

// string buffer me indexof ka  use kyu nhi hota hai or builder me kyu hota hai...... 