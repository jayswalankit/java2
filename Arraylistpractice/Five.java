import java.util.*;

public class Five {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>count=new ArrayList<>();
        System.out.println("Enter your size");
        int n=sc.nextInt();
        int [] count1=new int[10];
        for(int i=0;i<n;i++){
            count.add(sc.nextInt());
 
            if (count.get(i) >= 0 && count.get(i) < count1.length) {
                count1[count.get(i)]++;
            }

        }
        System.out.println("result");
        for(int i=0;i<count1.length;i++){
            if(count1[i]>0){
               
                System.out.println(i+":"+count1[i]);
            }
        }
    }
}

