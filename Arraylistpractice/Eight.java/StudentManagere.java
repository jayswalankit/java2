import java.util.*;

class Course {
    String courseId;
    String courseName;

    Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public String toString() {
        return "Course Id: " + courseId + " Course Name: " + courseName;
    }
}

class Student {
    String studentId;
    String studentName;
    ArrayList<Course> enrolledCourses;

    Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.enrolledCourses = new ArrayList<>();
    }

    public void enroll(Course course) {
        enrolledCourses.add(course);
    }

    public void display() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Enrolled Courses:");
        for (Course course : enrolledCourses) {
            System.out.println(course);
        }
    }

    public void unenroll(String courseId) {
        boolean found = false;
        for (int i = 0; i < enrolledCourses.size(); i++) {
            if (enrolledCourses.get(i).courseId.equals(courseId)) {
                enrolledCourses.remove(i);
                found = true;
                System.out.println("Course ID: " + courseId + " has been removed for student " + studentName);
                break;
            }
        }
        if (!found) {
            System.out.println("Course ID: " + courseId + " not found for student " + studentName);
        }
    }
}

public class StudentManagere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.println("Enter number of students:");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.println("Enter student name:");
            String studentName = sc.nextLine();

            System.out.println("Enter student ID:");
            String studentId = sc.nextLine();

            Student std = new Student(studentId, studentName);

            System.out.println("Enter number of courses:");
            int n1 = sc.nextInt();
            sc.nextLine();

            for (int j = 0; j < n1; j++) {
                System.out.println("Enter course name:");
                String courseName = sc.nextLine();

                System.out.println("Enter course ID:");
                String courseId = sc.nextLine();

                std.enroll(new Course(courseId, courseName));
            }

            students.add(std);
        }

        System.out.println("Student Information:");
        for (Student student : students) {
            student.display();
        }

        System.out.println("Enter student ID to unenroll from a course:");
        String targetStudentId = sc.nextLine();
        System.out.println("Enter course ID to unenroll:");
        String targetCourseId = sc.nextLine();

        for (Student student : students) {
            if (student.studentId.equals(targetStudentId)) {
                student.unenroll(targetCourseId);
                break;
            }
        }

        sc.close(); 
    }
}