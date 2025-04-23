import java.util.*;
public class Additionl1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your strinng");
        String str=sc.nextLine();

     int []fre=new int[256];

     for(int i=0;i<str.length();i++){
        char a=str.charAt(i);
        fre[a]++;

     }

     for(int i=0;i<fre.length;i++){
        if(fre[i]>0){
            System.out.println((char)i+": "+fre[i]);
        }

     }
System.out.println(fre.length);

    }
}
