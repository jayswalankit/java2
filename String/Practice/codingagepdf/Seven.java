import java.util.*;
public class Seven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your String");
        String str=sc.nextLine();
        StringBuilder str1=new StringBuilder(str);
        int size=str1.length()/2;
        String str2= sc.nextLine();
        if(size%2==0){
            System.out.println("the size of word is: "+size);
        str1.insert(size, str2);
        System.out.println(str1);
        }
        else{
            System.out.println("the size of word is: "+size);
         str1.insert(size-1, str2);
         System.out.println(str1);
        }
       
    }
}
