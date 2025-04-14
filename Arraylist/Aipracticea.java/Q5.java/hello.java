import java.util.*;
class Encuplation {
    private String name;
   private  int rollno;

   Encuplation(String name,int rollno){
       this.name=name;
       this.rollno=rollno;
   }
   public void setName(String name){
       this.name=name;

   }
   public String  getname(){
      return name;
   }
   public void setRollno(int rollno){
       this.rollno=rollno;
   }
   public int getRollno(){
       return rollno;
   }
      @Override
   public String toString(){
    return "name: " + name + " rollno: " + rollno;
   }
}
public class hello extends Encuplation{
   hello(String name,int rollno){
       super(name, rollno);
   }
   public static void main(String[] args) {
     
       Scanner sc=new Scanner (System.in);
       System.out.println("enter your no");
       int n=sc.nextInt();
       sc.nextLine();
       Encuplation[] arr = new Encuplation[n]; 
          for(int i=0;i<n;i++){
           
        System.out.println("enter name:");
        String name = sc.nextLine();

        System.out.println("enter your rolno");
        int rollno = sc.nextInt();
          
        sc.nextLine();

        arr[i] = new Encuplation(name, rollno);
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

//  is me set name or rollno ka use kyu nhi hho rha aur karna hai to 
// String name = sc.nextLine();
// arr[i].setName(name); aise karne ka benefit.. hum waise kyu na kare jaise kiye hue hai...
