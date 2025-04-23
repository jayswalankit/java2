import java.util.*;

class Six {
      int id;
      String name;
      float marks;

      Six(int id,String name,float marks){
         this.id=id;
         this.name=name;
         this.marks=marks;
      }

      public void display(){
         System.out.println(id);
         System.out.println(name);
         System.out.println(marks);

      }

    

}
public class StudentManager extends Six {

   StudentManager(int id,String name,float marks){
      super(id, name, marks);
   }
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      ArrayList<Six>student=new ArrayList<>();
      System.out.println("Enter your size");
      int n=sc.nextInt();
      for(int i=0;i<n;i++){
         System.out.println("Enter your id");
         int id =sc.nextInt();
         System.out.println("Enter your name");
         String name=sc.next();
         System.out.println("Enter your marks");
         float marks=sc.nextFloat();
        
         student.add(new Six(id,name,marks));
      }
        for(Six detail: student){
         detail.display();

        } 
        System.out.println("enter student id you want to find");
        int newid =sc.nextInt();
        boolean a= true;
        for(int i=0;i<student.size();i++){
             if(student.get(i).id==newid){
                a=true;
                student.get(i).display();
                break;
             }
             }

         if(a==false){
          System.out.println("Either student is not present or id is wrong");
         }
         System.out.println("enter student id you want to remove");
         int newid1 =sc.nextInt();
         boolean a1= true;
         for(int i=0;i<student.size();i++){
              if(student.get(i).id==newid1){
               student.remove(i);
                 a1=true;
                System.out.println("found");
                break;
               
                
              }
             
          }
 
          if(a1==false){
           System.out.println("Either student is not present or id is wrong");
          }

          for(Six found:student){
            found.display();
          }
        }

        

   }
   
  
   




