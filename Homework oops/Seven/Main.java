import java.util.ArrayList;
import java.util.Scanner;

class Course {
    String CourseName;
    String CourseCode;

    Course(String CourseName,String CourseCode){
     
     this.CourseName=CourseName;
     this.CourseCode=CourseCode;
    }
}

 class Student    {
     String Studentname;
     Integer Studentid;
     ArrayList<Course>courses;

     Student (String Studentname,Integer Studentid,ArrayList<Course>coursrs){
       
        this.Studentname=Studentname;
        this.Studentid=Studentid;
        this.courses=new ArrayList<Course>();
     }
     @Override
     public String toString(){
        return Studentname+" is "+" enroll in "+courses;
     }
     
     
}

public class Main{
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);

      System.out.println("Enter no of Studets enroll in courses");
      int n=sc.nextInt();

      ArrayList<Student>students=new ArrayList<>();
          sc.nextLine();
      for(int i=0;i<n;i++){
         System.out.println("enter your name");
         String Studentname=sc.nextLine();
         System.out.println("enter your student id");
         int StudentId=sc.nextInt();
         sc.nextLine();
         System.out.println("Enter no of Courses for students");
         int n1=sc.nextInt();
         sc.nextLine();

        ArrayList<Course>courseList=new ArrayList<>();
        for(int j=0;j<n1;j++){
         System.out.println("enter your courses name");
         String coursesname=sc.nextLine();
         System.out.println("Enter your course code");
         String Coursecode=sc.nextLine();

         courseList.add(new Course(coursesname, Coursecode));

        }
      students.add(new Student(Studentname, StudentId ,courseList));


      }

      System.out.println("Enroll details");
      for(Student s: students){
         System.out.println(s);
      }
   }
}


