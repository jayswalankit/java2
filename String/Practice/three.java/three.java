import java.util.*;

public class three {
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer("Ankit");
        // str.append("ANkesh");
        // str.replace(0, 0, "e");
        int a=str.indexOf("k");
        int b=str.length();
        System.out.println(str);
        System.out.println(a);
        System.out.println(b);
        StringBuffer str2=new StringBuffer("Ankit");
        // System.out.println(str.toString().equalsIgnoreCase(str2.toString()));
       boolean Str3 = str.equals(str2);
       System.out.println(Str3);

    }
}
