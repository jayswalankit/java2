import java.util.*;
public class One {

    public static void checkAge(int age) throws Exception {
        if(age<18){
            throw new Exception("not ");
          }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your age");
        int age=sc.nextInt();
        try {
            checkAge(age);
            System.out.println("welcome");
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        finally{
            System.out.println("end ");
        }
    }
}
