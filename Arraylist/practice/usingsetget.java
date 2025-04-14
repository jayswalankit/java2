import java.util.*;

public class usingsetget {
    private  String name;
    private int rollno;

    usingsetget(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }
    public void setRollno(int rollno){
      this.rollno=rollno;
    }
    
    public int getRollno(){
        return rollno;
    }
    
        public String toString(){
            return "name: ,"+name+" rollno:  "+rollno;
        }
    ArrayList<usingsetget> hello = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter your no");
        int n=sc.nextInt();
       System.out.println("enter your detail");
        ArrayList<usingsetget> hello = new ArrayList<>();
        
         for(int i=0;i<n;i++){
            System.out.println("Enter name for student " + (i + 1) + ":");
            sc.nextLine(); 
            String name = sc.nextLine();

            System.out.println("Enter roll number for student " + (i + 1) + ":");
            int rollno = sc.nextInt();

            usingsetget obj = new usingsetget(name,rollno);
            hello.add(obj);
         }
         for(usingsetget sttudent : hello){
            System.out.println(sttudent);
         }
   

    }
}
