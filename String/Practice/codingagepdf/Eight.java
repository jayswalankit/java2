import java.util.*;
public class Eight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
        StringBuilder str1=new StringBuilder(str);
    //     System.out.println(str1.length());
    //    System.out.println(str1.toString().trim());
    //    System.out.println(str1.length());

    StringBuilder str3 = new StringBuilder();
    for(int i=0;i<str1.length();i++){
        char ch=str1.charAt(i);
        if(ch==' '){
            continue;
            
        }
        
        str3.append(ch);
    }
    System.out.println(str3);
    }
}



// how trim work kyuki size kaam nhiu hua means shift ya kuch aur

// hum str3 ke use se kyu sace hata paa rhe bina str3 ke kyu nhi jab ki string builder to append ka use kar ke ussi me change kar sakta hai... 