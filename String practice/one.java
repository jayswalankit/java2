import java.util.*;

public class one {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
   System.out.println("Enter your word");
   String word=sc.nextLine();
   
   char[] arr=word.toCharArray();

   String rev="";
   for(int i=word.length()-1;i>=0;i--){
        rev+=arr[i];
   }
   System.out.println(rev);
   }

}
