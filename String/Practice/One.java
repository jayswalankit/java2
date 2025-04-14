
import java.util.*;

public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String str = "     Ankit jayswal";
        String str2 = "Ankit  jaysawal ....";
        System.out.println("using to uppercase " + str.toUpperCase());
        System.out.println(" using to lowercaase " + str2.toLowerCase());
        System.out.println("using literals " + str.equalsIgnoreCase(str2));
        System.out.println("using length " + str.length());
        System.out.println("using char at " + str.charAt(3));
        System.out.println("using indexOf " + str2.indexOf("k"));
        System.out.println("using sub string " + str2.substring(1, 3));
        System.out.println("using concate " + str.concat(str2));
        System.out.println("using trim " + str.trim());
        System.out.println("using strip trailiing " + str.stripTrailing());
        System.out.println("using strip Leading " + str.stripLeading());
        System.out.println("using strip Indent  " + str.stripIndent());
    }
}
