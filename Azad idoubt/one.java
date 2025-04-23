import java.util.*;

public class one {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.next();
        System.out.println("Enter your id");
        int id=sc.nextInt();
        ArrayList<Integer>marks=new ArrayList<>();
        System.out.println("Enter your no of subject you have");
        int no=sc.nextInt();
        for(int i=0;i<no;i++){
             marks.add(sc.nextInt());
        }
       
       
    }
}
