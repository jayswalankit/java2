import java.util.*;

public class Student {
    private int[] marks;

    Student(int[]marks){
        this.marks=marks;
    }
    public void setmarks(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your no of sunject");
        int n=sc.nextInt();
    
        marks=new int[n];
        for(int i=0;i<marks.length;i++){
                System.out.println("subject: "+(i+1));
                marks[i]=sc.nextInt();
            }
     
    }
     public double calculateavg(){
       int sum=0;
       for(int i=0;i<marks.length;i++){
         sum+=marks[i];
        
       }
       return sum/(double)marks.length;
     }
    
     public char grade(){
        double average=calculateavg();
        if(average>=90){
            System.out.println("A");
        }
        else if(average>=80){

        }
     }

     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student obj=new Student(null);
        obj.setmarks();
        System.out.println(obj.calculateavg());
     }
}
