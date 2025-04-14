import java.util.*;
public class Five {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int[] count=new int[256];   //256 isliye leta hai kyu ki total ascii value 256 hai isme sab aata hai
        for(int i=0;i<str.length();i++){
            char a=str.charAt(i);
            count[a]++;
        }
        for(int i=0;i<count.length;i++){
            if(count[i]>0){
                System.out.println((char) i + ": " + count[i]);
            }
        }
        System.out.println("length"+ count.length);
    }
}


