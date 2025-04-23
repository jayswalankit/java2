 import java.util.*;
 class hello {
    private String name;
    private int id;

    hello(String name,int id){
        this.name=name;
        this.id=id;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
         return name;
    }
   
    public void setId(int id){
        this.id=id;
    }

    public int  getId(){
        return id;
    }

    public String toString(){
        return "name"+name+"id"+id;
    }
}

public class management{
    Scanner sc=new Scanner(System.in);

    ArrayList<hello>school=new ArrayList<>();

    public void addStudent(){

        System.out.println("enter the no of student you want to add");

        int n=sc.nextInt();
         sc.nextLine();
        for(int i=0;i<n;i++){

            System.out.println("Enter Student's Name");
            String name=sc.nextLine();
            
            System.out.println("Enter Student's id");
            int id=sc.nextInt();
            sc.nextLine();
            school.add(new hello(name,id));
        }

    }

    public void removeStudent(){
        System.out.println("Enter the name of student you want to remove");
        String names=sc.nextLine();
        boolean found=false;
        for(int i=0;i<school.size();i++){
            hello student=school.get(i);
            if(student.getName().equals(names)){
                school.remove(i);
                found=true;
            }
        }
  

    }
    public void display(){
        for(int i=0;i<school.size();i++){
         System.out.println(school.get(i));
        }
    }
   public static void main(String[] args) {
    management obj=new management();

        obj.addStudent();
       
       obj.display();
       obj.removeStudent();;
       obj.display();


   }
}
