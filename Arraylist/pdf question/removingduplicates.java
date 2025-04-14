import java.util.*;

public class removingduplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your size");
        int n=sc.nextInt();
        System.out.println("enter your element");
        for (int i = 0; i < n; i++) {
            int duplicate=sc.nextInt();
            list.add(duplicate);
        }
        for (int i = 0; i < list.size(); i++){
            for (int j = i + 1; j < list.size(); j++) {
                if(list.get(i)==list.get(j)){
                // if(list.get(i).equals(list.get(j))){
                    list.remove(j);
                
                }
            }
        }

            System.out.println(list);
        
       
       
       
    }
}









