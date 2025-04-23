import java.util.*;
public class Seven {
    String name;
    int id;
    float[] marks;

    Seven(String name,int id,float[]marks){
        this.name=name;
        this.id=id;
        this.marks=marks;
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

    public int getId(){
   return id;
    }

    public void setMarks(float[]marks){
        this.marks=marks;
    }

    public void add(){
        float total=0;
         for( float mark:marks){
            total+=mark;
         }
         total/=marks.length;
         System.out.println(total);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        Seven obj=new Seven(null, 0, null);
        System.out.println("Enter your name");
       obj.setName(sc.nextLine());

        System.out.println("Enter your id");
        obj.setId(sc.nextInt());

        System.out.println("Enter size");
        int n=sc.nextInt();

        System.out.println("Enter your marks");
        obj. setMarks(new float[n]);
        for(int i=0;i<n;i++){
            obj.marks[i]=sc.nextInt();

        }
        System.out.println(obj.getName());
        System.out.println(obj.getId());
        obj.add();
        
    }
}
