
import java.util.*;
 public class Onee{
    int name;
    int id;
    Onee(ArrayList<String> name, ArrayList<Integer>id){
        this.name=name;
        this.id=new ArrayList<>();
    }
    public ArrayList<String> getName()
    {
        return this.name;
    }
    public void setStudentDetail(){
        Scanner sc=new Scanner(System.in);
        System.out.println("no of student you want to add");
        int n=sc.nextInt();
      for(int i=0;i<n;i++){
        System.out.println("enter name");
        sc.nextLine();
      this.name.add(sc.nextLine());
      System.out.println("enter id");
      this.id.add(sc.nextInt());
     
      }
    }
    
    public static void main(String[] args) {
        ArrayList<String> first = new ArrayList<>();
        Onee obj=new Onee(first, null);

        System.out.println(first);
        obj.setStudentDetail();
          System.out.println(obj.getName());

    }

}


