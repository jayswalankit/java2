import java.util.*;

public class Four {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> str=new ArrayList<>();
        System.out.println("enter your size");
        int n=sc.nextInt();
        System.out.println("enter your no");
        for(int i=0;i<n;i++){
           str.add(sc.nextLine());
        }

        for(int i=0;i<str.size();i++){
           System.out.println(str.get(i));
        }

    }
}
