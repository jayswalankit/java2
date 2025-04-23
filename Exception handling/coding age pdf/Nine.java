import java.util.*;

class InvalidMarksException extends Exception {
   public InvalidMarksException(String messege){
    super(messege);
   }
}
public class Nine {
    int marks;
     public Nine(int marks){
        this.marks=marks;
     }
     public void result()throws InvalidMarksException{
        if(marks<0||marks>100){
            throw new InvalidMarksException("Invalid marks: " + marks);
        }
     }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your marks");
        int a=sc.nextInt();
        Nine obj=new Nine(a);
        try {
            obj.result();
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
     }
}
