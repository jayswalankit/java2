import java.util.*;

class Custom {
    int id;
    String name;
    int marks;

    Custom(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    @Override
    public String toString(){

        return "Custom{" + id + ", " + name + ", " + marks + "}";
    }

}

public class Student{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    List<Custom> Students = new ArrayList<>();
    System.out.println("Enter the number of students:");
    int n = sc.nextInt();
   
    for(int i=0;i<n;i++){
        System.out.println(i++);
        System.out.println("enter student id");
        int a=sc.nextInt();
        sc.nextLine();
        System.out.println("enter student name");
        String b=sc.nextLine();
        System.out.println("enter student marks");
        int c=sc.nextInt();

        Students.add(new Custom(a, b, c));
        Collections.sort(Students, Comparator.comparingInt(student -> student.marks));
    }
     
    System.out.println("Sorted list of students by marks:");
    for (Custom student : Students) {
        System.out.println(student);
    }
   
  }
}
