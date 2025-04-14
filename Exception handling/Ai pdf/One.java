import java.util.*;
public class One {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your no you want to divide");
    int a=sc.nextInt();
    try {
        int b=a/0;
    } catch (Exception e) {
        System.out.println(e);
    }
  }  
}
