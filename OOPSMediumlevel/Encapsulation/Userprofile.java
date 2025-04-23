import java.util.*;
public class Userprofile{
    private String name;
    private String email;
    private int age;

    public Userprofile(String name,String email,int age){
        this.name=name;
        this.email=email;
        this.age=age;
    }
     public void setName(String name){
        this.name=name;
     }
     public void setEmail(String email){
        if(email.contains("@")){
            this.email=email;
        }
        else{
            System.out.println("invalid");
        }
     }
     public void setAge(int age){
        this.age=age;
     }

     public String getName(){
        return name;
     }
     public String getEmail(){
        return email;
     }
     public int getAge(){
        return age;
     }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Userprofile obj=new Userprofile(null, null, 0);
        System.out.println("enter your name");
      obj.setName(sc.nextLine());
        System.out.println("enter your email");
        obj.setEmail(sc.nextLine());
        System.out.println("enter your age");
      obj.setAge(sc.nextInt());

        System.out.println(obj.getName());
       System.out.println(obj.getEmail());
       System.out.println(obj.getAge());
     }
}