import java.util.*;

public class two {
   String title;
   String Author;
   int price;
   public void affordable(int price1){
    Scanner sc=new Scanner(System.in);
   
    
    if(price<=price1){
        System.out.println("yes you can afford");
    }
    else{
        System.out.println("not");
    }
   }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    two obj=new two();
    System.out.println("enter title");
    obj. title=sc.nextLine();
    System.out.println("enter author name");
    obj.Author =sc.nextLine();
    System.out.println("enter your price");
    obj. price=sc.nextInt();
    System.out.println("enter your budget");
    int price1=sc.nextInt();
    obj.affordable(price1);
   } 
}
