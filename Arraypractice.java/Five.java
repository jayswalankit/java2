import java.util.Scanner;

public class Five { public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
           
        System.out.println("Enter your size");
        int n=sc.nextInt();

       int [] arr=new int[10];
      
       System.out.println("Enter your element");
       for(int i=0;i<n;i++){
       int input=sc.nextInt();
       sc.nextLine();

        if(input>=0&&input<arr.length){
            arr[input]++;
        }
       }

       System.out.println("result");
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
               
                System.out.println(i+":"+arr[i]);
            }
        }

    }
}
