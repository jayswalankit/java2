import java.util.*;

public class Three {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String>reverse=new ArrayList<>();
        System.out.println("enter your size");
        int n=sc.nextInt();
        System.out.println("Enter your elements");
        for(int i=0;i<n;i++){
         reverse.add(sc.next());
        }

        for(int i=0;i<reverse.size();i++){
            for(int j=i+1;j<reverse.size();j++){
                // if(reverse.get(i).compareTo(reverse.get(j))<0){
                    String tem=reverse.get(i);
                    reverse.set(i, reverse.get(j));
                    reverse.set(j, tem);
                
            }
            System.out.println(reverse.get(i));
        }
    }
   
}
