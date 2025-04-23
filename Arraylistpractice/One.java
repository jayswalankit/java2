import java.util.*;

public class One {
    public static void main(String[] args) {
        ArrayList<Integer>Number=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your size");
        int n=sc.nextInt();
        System.out.println("Enter your number");
        for(int i=0;i<n;i++){
            Number.add(sc.nextInt());
            
        }
          
        label: for(int i=0;i<Number.size();i++){
            for(int j=0;j<Number.size();j++){
                // if(i!=j&&Number.get(i).equals(Number.get(j))){
                    if(i!=j&&Number.get(i).equals(Number.get(j))){
                 continue label;
                }
             
            }
            System.out.println(Number.get(i));
        }
       
    }
}
