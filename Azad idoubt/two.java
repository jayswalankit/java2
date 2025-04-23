import java.lang.reflect.Array;
import java.util.*;

class TTwo {
    String name;
    int id;
    float marks;

    TTwo(String name, int id, float marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }

    // public String toString() {
    //     return "name: " + name + " id: " + id + " marks: " + marks;
    // }
}

public class two {

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<TTwo> sort = new ArrayList<>();
        System.out.println("Enter your size");
        int no = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < no; i++) {
            System.out.println("Enter your name");
            String name = sc.nextLine();

            System.out.println("Enter your id");
            int id = sc.nextInt();

            System.out.println("Enter your marks");
            float marks = sc.nextFloat();
            sc.nextLine();

            sort.add(new TTwo(name, id, marks));

        }

        for (int i = 0; i < sort.size(); i++) {
            for (int j = i + 1; j < sort.size(); j++) {
                if (sort.get(i).marks < sort.get(j).marks) {
                    TTwo tem = sort.get(i);
                    sort.set(i, sort.get(j));
                    sort.set(j, tem);
                }
            }
            // System.out.println(sort.get(i));
        }

        for(TTwo wow:sort){
            System.out.println("Name: " + wow.name + ", ID: " + wow.id + ", Marks: " + wow.marks);
        }

    }
}
