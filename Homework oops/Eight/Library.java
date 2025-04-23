import java.util.*;

public class Library {
    static Integer totalbook;
     
     public static  void BorrowBook(){
        Scanner sc=new Scanner(System.in);
        
        if(totalbook <=0){
            System.out.println("not available books");
        }
        else{
            System.out.println("enter no of book you want to borrow");
            int borrowbook=sc.nextInt();
            totalbook-=borrowbook;
            System.out.println("available book");
            System.out.println(totalbook);
        }
     }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of total book");
        totalbook =sc.nextInt();
        BorrowBook();
     }
}
