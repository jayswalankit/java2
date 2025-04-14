import java.util.*;
public class four{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your String");
        String str=sc.nextLine();
        String str2="";
       
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
          char ch=str.charAt(i);
          boolean c=true;
          // for(int j=0;j<str.length();j++){
          //   if (i != j && ch == str.charAt(j)) {
            for(int j=i+1;j<str.length();j++){
              if ( ch == str.charAt(j)) {
            c=false;
                break;
          }
        
        }
        if(c){
          str2+=ch;
        }
    }
    System.out.println(str2);
}
}