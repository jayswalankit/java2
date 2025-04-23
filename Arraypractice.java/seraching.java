import java .util.*;
public class seraching {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your size");
    int n=sc.nextInt();
    int[]arr=new int[n];
    System.out.println("Enter youur element");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();;
    }
       
    System.out.println("Enter your no you want to find");
    int wow=sc.nextInt();

    for(int i=0;i<n;i++){
        
            if(arr[i]==wow){
                continue;
        }
        System.out.println(arr[i]);
    }
    

  }  
}
