import java.util.*;

public class Student_grade {
    String name;
    int [] grade;

    Student_grade(String name,int[]grade){
        this.name=name;
        this.grade=grade;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setGrade(int  n){
        Scanner sc=new Scanner(System.in);
       
        grade =new int[n];
        for(int i=0;i<n;i++){
         grade[i]=sc.nextInt();
        }
       
    }
    public int[] getGrade(){
        return grade;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Student_grade obj=new Student_grade(null, new int[0]);
    System.out.println("enter noame");
    obj.setName(sc.nextLine());
    System.out.println("enter no of grade");
    int n=sc.nextInt();
    obj.setGrade(n);

    System.out.println(obj.getName());
    for(int a:obj.getGrade()){
        System.out.println(a);
    }

    }

   


}














// import java.util.*;
// public class pra1 {
//    private String name;
//    private int []grade;
//     pra1(String name, int []grade) {
//         this.name = name;
//         this.grade = grade;
//     }
//     public String getName() {
//         return name;
//     }
//     public int[] getGrade() {
//         return grade;
//     }
//     public void setName(String name) {
//         this.name = name;
//     }
//     public void setGrade(int n) {
//         Scanner sc = new Scanner(System.in);
//          grade = new int[n];
//         for (int i = 0; i < n; i++) {
//              grade[i] = sc.nextInt();
//         }

//     }
//     public static void main(String[] args) {
//         pra1 obj = new pra1("", new int[0]);
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the name of the student:");
//         obj.setName(sc.nextLine());

//         System.out.println("Enter the number of grades:");
//         int n = sc.nextInt();

//         obj.setGrade(n);

//         System.out.println("Name: " + obj.getName());
//         System.out.print("Grades: ");
//         for (int grade : obj.getGrade()) {
//             System.out.print(grade + " ");
//         }
//     }


// }
