
import java.util.*;
 public class additional1 {
    String name;
    String id;
    ArrayList<Integer>marks;
    
    additional1(String name,String id,ArrayList<Integer>marks){
    this.name=name;
    this.id=id;
     this.marks=new ArrayList<>();
    }
     public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setMarks(ArrayList<Integer> marks) {
        this.marks =new ArrayList<>(marks);
    }

    public ArrayList<Integer> getMarks() {
        return marks;
    }


    

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        
   
        additional1 obj=new additional1(null,null,null);
    System.out.println("Enter your name ");
    obj.setName(sc.nextLine());
    System.out.println("Enter your id");
  obj.setId(sc.nextLine());
 
    System.out.println("enter how many subjsct marks");
    int n=sc.nextInt();
    ArrayList<Integer>marks=new ArrayList<>();
    for(int i=0;i<n;i++){
       
        marks.add(sc.nextInt());
      
        obj.setMarks(marks);
    }

    
      
    System.out.println(obj.getName());
    System.out.println(obj.getId());
   System.out.println(obj.getMarks());
    }

    

}













// import java.util.ArrayList;
// import java.util.*;
// public class Management {
//     String name ;
//     int id;
//     ArrayList<Integer>marks = new ArrayList<>();
//     Management (String name, int id , ArrayList<Integer>marks)
//     {
//     this.name = name;
//     this.id =id;
//     this.marks = new ArrayList<>();
//     }
//     public void setname(String name){
//       this.  name = name;
//     }
//     public String getname(){
//         return name;
//     }
//     public void setid(int id){
//       this.  id = id;
//     }
//     public int getid(){
//         return id;
//     }
//     public void setmarks(ArrayList<Integer>marks){
//         this.marks = marks;
//     }
//     public ArrayList<Integer>getmarks(){
//         return marks;
//     }
//     // void display(){
//     //     System.out.println(name+id);
//     //     for(int marks: marks){
//     //         System.out.println(marks);
//     //     }
//     // }

//     public static void main(String[] args) {
//         Management obj = new Management(null, 0, null);
//     ArrayList<Integer> marks = new ArrayList<>();
//     Scanner sc = new Scanner(System.in);
//     System.out.println("enter the name");
//     // obj. name = sc.nextLine();
//     obj.setname(sc.next());
//     System.out.println("enter the id");
//     // obj. id = sc.nextInt();
//     obj.setid(sc.nextInt());
//     System.out.println("enter the marks");
//     for (int i = 0; i < 3; i++) {
//         marks.add(sc.nextInt());
//     }
//     obj.setmarks(marks);
//     System.out.println(obj.getname());
//     System.out.println(obj.getid());
//     System.out.println(obj.getmarks());
//     // obj.display();

//     // System.out.println(name+id);
//     // for(int mar :marks){
//     //     System.out.println(mar);
//     // }
//     }

// }
 










