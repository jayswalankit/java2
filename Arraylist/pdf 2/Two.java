import java.util.*;

public class Two {
    public void common() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> no = new ArrayList<>();
        System.out.println("enter your size");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            no.add(sc.nextInt());
        }
        ArrayList<Integer> no1 = new ArrayList<>();
        System.out.println("enter your size");
        int n1 = sc.nextInt();
        for (int i = 0; i < n1; i++) {
            no1.add(sc.nextInt());
        }
        int size = no.size();
        int size1 = no1.size();
       
        if (size >= size1) {
            for (int i = 0; i < no.size(); i++) {
                if (no.contains(no1.get(i))) {
                    System.out.println(no.get(i)+"result");
                }

            }
        } else {
            for (int i = 0; i < no1.size(); i++) {
                if (no1.contains(no.get(i)) ) {
                    System.out.println(no.get(i)+"result");
                 }

            }
        }
        
    }

    public static void main(String[] args) {
        Two obj = new Two();
        obj.common();
    }
}
