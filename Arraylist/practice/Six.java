
import java.util.*;

public class Six {
    String name;
    int rollno;
    int marks;

    Six(String name, int rollno, int marks) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }

    public void show() {
        System.out.println("St Mary's Public School");
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Roll No: %d, Marks: %d", name, rollno, marks);
    }

    public static void main(String[] args) {
        ArrayList<Six> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students:");
        int n = sc.nextInt();

        System.out.println("Enter student details:");
        for (int i = 0; i < n; i++) {
            sc.nextLine(); // Consume newline left-over
            System.out.println("Enter name:");
            String name = sc.nextLine();
            System.out.println("Enter roll number:");
            int rollno = sc.nextInt();
            System.out.println("Enter marks:");
            int marks = sc.nextInt();

            students.add(new Six(name, rollno, marks));
        }

        for (Six student : students) {
            student.show();
        }

        
        for (int i = 0; i < students.size(); i++) {
            for (int j = i + 1; j < students.size(); j++) {
                if (students.get(i).marks < students.get(j).marks) {
                    Six temp = students.get(i);
                    students.set(i, students.get(j));
                    students.set(j, temp);
                }
            }
        }

        System.out.println("Students sorted by marks:");
        for (Six student : students) {
            System.out.println(student);
        }
    }
}
