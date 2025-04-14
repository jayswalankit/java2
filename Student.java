


import java.util.Scanner;

public class Student {
    String name;
    int age;
    String grade;

    Student (String name,int age,String grade){
        this.name=name;
        this.age=age;
        this.grade=grade;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student [] arr=new Student[5];
        for(int i=0;i<5;i++) {
            System.out.println("Student name");
            String name = sc.nextLine();
            System.out.println("enter student age");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.println("enter your grade");
            String grade = sc.nextLine();
            arr[i] = new Student(name, age, grade);
        }
        for(int i=0;i<5;i++){
            System.out.println(arr[i].name+arr[i].age+arr[i].grade);
        }
    }
}
