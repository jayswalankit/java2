import java.util.*;

class Three {
   public void hello(){
    System.out.println("hello");
   }
}
public class hii extends Three{
   public void hello(){
      System.out.println("the boss");
   }
   public static void main(String[] args) {
      Three obj=new Three();
       try {
         hii obj2=(hii)obj;
         obj.hello();
       } catch (Exception e) {
       System.out.println("exception "+e);
       }
   }
}
