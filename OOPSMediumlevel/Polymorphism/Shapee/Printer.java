import java.util.*;

public class Printer {
    public void printInt(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your no int");
     int   a=sc.nextInt();
       System.out.println(a);
    }

    public void printFloat(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your no float");
      float  a=sc.nextFloat();
       System.out.println(a);
    }

    public void printString(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
      String a=sc.nextLine();
       System.out.println(a);
    }

    public static void main(String[] args) {
        Printer obj=new Printer();
        obj.printInt();
        obj.printFloat();
      obj.printString();
    }
}
