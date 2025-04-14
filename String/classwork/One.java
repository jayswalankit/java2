

public class One {

    // using string literals;
    public static void main(String[] args) {
        String s1="Ankit";
        String s2="Ankit";
        String s3=new String("Ankit");
        System.out.println(s1==s2); // using string literals
        System.out.println(s1==s3); // using new string
        // false because s3 heap memory me banta hai isliye s1 aur a3 ka koi connection nhi....
        System.out.println(s1.length());
        String s="ankit";
        System.out.println(s.toUpperCase());
        String s4="Ayush";
        System.out.println(s4.toLowerCase());
        System.out.println(s.charAt(3));


        String a="Communication well";
        System.out.println(a.substring(3, 6));
        System.out.println(a.replace("well","good"));
        System.out.println(s1.equals(s));
        System.out.println(s1.equalsIgnoreCase(s));


        String f="       Communication well        ......";
        System.out.println(f.trim());
        System.out.println(f.stripTrailing());

        String lang="python,java,C++,Java";
        String [] arr=lang.split(",");
        System.out.println(lang);
        for(String str:arr){
             System.out.println(str);
        }


        String w="java programming";
        String r=" In Coding Age";
        System.out.println(w.startsWith("programming"));
        System.out.println(w.startsWith("java"));
        System.out.println(w.concat (r));


        String t="Ankit";
        String y="Azad";
        System.out.println(t.compareTo(y));
    }
}



// next class topic string buffer,  string builder,string constant pull....