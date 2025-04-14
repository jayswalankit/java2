import java.util.*;
class Encuplation {
    private String name;
   private  int rollno;

   
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
   
   public static void main(String[] args) {
     
       Scanner sc=new Scanner (System.in);
       System.out.println("enter your no");
       int n=sc.nextInt();
       sc.nextLine();
       Encuplation[] arr = new Encuplation[n]; 
          for(int i=0;i<n;i++){
            Encuplation obj = new Encuplation(); // Declare and initialize obj
            System.out.println("enter name:");
            obj.setName(sc.nextLine());

          
            obj.setRollno(sc.nextInt()); // Set roll number for obj
            arr[i] = obj; // Store obj in the array
         
              
            sc.nextLine();

            
          }
       System.out.println("Result");
       for(Encuplation q : arr){
           System.out.println(q);
       }

       
   }
  
}

