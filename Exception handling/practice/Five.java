import java.util.*;
public class Five {
     public static void main(String[] args) {
        int [] arr=new int[4];
        arr[0]=1;  
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
  Scanner sc=new Scanner (System.in);
        boolean flag=true;
        while(flag){
            System.out.println("enter your index no between 0and 4");
            int a=sc.nextInt();
            try {
                System.out.println("ankit");
                try{
                    System.out.println(arr[a]);
                    flag=false;
                }
                catch(ArrayIndexOutOfBoundsException e1){
                   System.out.println("sorry");
                }
            } 
            
            catch (Exception e) {
                System.out.println("An error occurred: ");
            }
          
        }
       System.out.println("end");

   
     }
}
