 import java.util.*;
 class Encuplation {
    String name;
    int rollno;

}
public class hello extends Encuplation{
    public static void main(String[] args) {
        hello obj=new hello();
        Scanner sc=new Scanner (System.in);
        System.out.println("enter your no");
        int n=sc.nextInt();
        Encuplation[] arr = new Encuplation[n]; 
        for(int i=0;i<n;i++){
    arr[i] = new Encuplation();
    System.out.println("Enter name:");
    arr[i].name = sc.next();
    System.out.println("Enter roll number:");
    arr[i].rollno = sc.nextInt();
        }

        System.out.println("Result");
        for(Encuplation q : arr){
            System.out.println(q);
        }

        // for(int i=0;i<arr.length;i++){
        //     // System.out.println(arr[i].name + " " + arr[i].rollno);
            
        // }
        // arr[i] referece to object of String and int of encaplusation class thats why its print hashcode.....
    }
   
}
