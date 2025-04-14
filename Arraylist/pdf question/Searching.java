import java.util.ArrayList;
import java.util.Scanner;

public class Searching {
    public static void main(String[] args) {
        System.out.println("enter your size ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         ArrayList<Integer>search=new ArrayList<>();     
         System.out.println("enter your no");  
         for(int i=0;i<n;i++){
            int number =sc.nextInt();
            search.add(number);
         }
         System.out.println("no you want to find");
         int a=sc.nextInt();
         boolean found=false;
         for(int i=0;i<n;i++){
            if(a==search.get(i)){
                found=true;
                 break;
            }
        }
           if(found==true){
            System.out.println("found");
           }
           else{
            System.out.println("not found");
           }
         
     

    }
}
