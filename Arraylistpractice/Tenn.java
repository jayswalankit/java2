import java.util.*;

class ten {
   String name;
   int id;
   ArrayList<Float> mark;

   ten(String name, int id, ArrayList<Float> mark) {
      this.name = name;
      this.id = id;
      this.mark = mark;
   }

   public String toString() {
      return "Name: " + name + " id: " + id + " marks: " + mark;
   }
}

public class Tenn {

   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      ArrayList<ten> detail = new ArrayList<>();

      System.out.println("Enter your size");
      int size = sc.nextInt();

      sc.nextLine();

      for (int i = 0; i < size; i++) {
         System.out.println("Enter your name");
         String name = sc.nextLine();

         System.out.println("Enter your id");
         int id = sc.nextInt();

         ArrayList<Float> marks = new ArrayList<>();

         System.out.println("enter your total subject");
         int subject = sc.nextInt();

         sc.nextLine();
         for (int j = 0; j < subject; j++) {
            marks.add(sc.nextFloat());
         }
         sc.nextLine();

         detail.add(new ten(name, id, marks));

      }
      for (ten student : detail) {
         System.out.println(student);
      }
   }

}
