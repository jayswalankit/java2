import java.util.*;
// public class Six {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter your String");
//         String str =sc.nextLine();
//         str=str.toLowerCase();
//         StringBuilder str1=new StringBuilder(str);
//         for(int i=0;i<str1.length();i++){
//             for(int j=i+1;j<str1.length();j++){
//                 char tem = str1.charAt(i);
//                 str1.setCharAt(i, str1.charAt(j));
//                 str1.setCharAt(j, tem);
//             }
//         }
//         System.out.println(str1);
//     }
// }

public class Six{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your String");
        String str =sc.nextLine();
         str=str.toLowerCase();
        StringBuilder str1=new StringBuilder();
    
        for(int i=str.length()-1;i>=0;i--){
            str1.append(str.charAt(i));
        

    }
    System.out.println(str1);
}
}