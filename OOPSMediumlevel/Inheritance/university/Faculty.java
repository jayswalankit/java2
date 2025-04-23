import java.util.Scanner;

public class Faculty extends person {
     Faculty(String name,int id){
        super(name, id);
    }
     public void display(){
        System.out.println(name);
        System.out.println(id);
     }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println("enter Student name");
       String name=sc.nextLine();
       System.out.println("enter you id");
       int id=sc.nextInt();

       Faculty obj=new Faculty(name,id);
       obj.display();
     }
}
