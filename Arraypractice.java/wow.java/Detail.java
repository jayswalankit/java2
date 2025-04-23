
import java.util.*;

 class Student {
   String name;
   int id;
   int[]marks;
   

   Student(String name,int id,int[]marks){
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

public void setMarks(int [] marks){
    this.marks=marks;
}

public int[] getMarks(){
   return marks;
}

}

 public class Detail{
    Student[]detail;

public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);

    System.out.println("Enter your size");

    int n=sc.nextInt();

     sc.nextLine();

    Student[]arr =new Student[n];
    

    for(int i=0;i<arr.length;i++){

        System.out.println("Enter your name");

        String name=sc.next();

        System.out.println("Enter your id");

        int id=sc.nextInt();

        System.out.println("Enter your total subject");

        int total=sc.nextInt();

        System.out.println("Enterr your marks");

        int [] marks=new int[total];

        for(int j=0;j<marks.length;j++){

           marks[j]=sc.nextInt();

        }
        
         arr[i]=new Student(name, id, marks);

    }

    for (Student student : arr) {
       System.out.println(student.getName());
       System.out.println(student.getId());
       System.out.println(Arrays.toString(student.getMarks()));
    }

}

}
