
import java.util.*;
public class Three {
    public void reverse(){
        ArrayList<Integer>rev=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter your size");
         int n=sc.nextInt();
         for (int i=0;i<n;i++){
            rev.add(sc.nextInt());
         }
         
         for(int i=0;i<rev.size();i++){
          for(  int j=i+1;j<rev.size();j++){
             Integer tem=rev.get(i);
             rev.set(i, rev.get(j));
            //  rev.set(i, rev.get(tem)); giving erro;
             rev.set(j, tem);
          }
          System.out.println(rev.get(i));
         }
    }
    public static void main(String[] args) {
        Three obj=new Three();
        obj.reverse();
    }
}
