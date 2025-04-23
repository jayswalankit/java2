import java.util.*;
public class Three {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          System.out.println("enter youur string");
          String str=sc.nextLine();

          char[] str1=str.toCharArray();
          
         String result="";
         
          for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                char tem=str1[i];
                str1[i]=str1[j];
                str1[j]=tem;
              
            }
             result+=str1[i];
            
          }
          System.out.println(result);
    }
}
