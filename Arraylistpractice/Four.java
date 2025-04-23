
import java.util.*;
public class Four {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>merge=new ArrayList<>();
        System.out.println("enter your 1st array list size");
        int n=sc.nextInt();

        ArrayList<Integer>merge1=new ArrayList<>();
        System.out.println("enter your 2nd array list size");
        int n1=sc.nextInt();

        System.out.println("enter your elemnt of 1st");
        for(int i=0;i<n;i++){
            merge.add(sc.nextInt());
        }

        System.out.println("enter your elemnt of 2nd");
        for(int i=0;i<n1;i++){
            merge1.add(sc.nextInt());
        }
       merge.addAll(merge1);
        // System.out.println(merge);
        // System.out.println(merge.size());

        int size=merge.size();
        for(int i=0;i<merge.size();i++){
          for(int j=i+1;j<merge.size();j++){
            if(merge.get(i)>merge.get(j)){
            int tem=merge.get(i);
            merge.set(i, merge.get(j));
            merge.set(j, tem);
          }
        }
        
         System.out.println("merge");
         for(int f:merge){
            System.out.println(f);
         }
        }
    }

    
}
