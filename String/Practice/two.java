import java.util.*;

public class two {
    public static void main(String[] args) {
        StringBuffer a=new StringBuffer("ankit");
        a.append("azad");
        a.replace(5, 9, "aayush");
         
        System.out.println(a);
        String b=new String("Ankit");
        System.out.println("String: "+b);
        System.out.println(b.equals(a));
        System.out.println(b);

     
   
    String lang="python,java,c,c++";
    String[] languages = lang.split(",");
    StringBuffer[] arr = new StringBuffer[languages.length];
    for (int i = 0; i < languages.length; i++) {
        arr[i] = new StringBuffer(languages[i]);
    }
  for(StringBuffer str : arr){
    System.out.println(str);
  }
       

    }
}
