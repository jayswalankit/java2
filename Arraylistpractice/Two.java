import java.util.*;

public class Two {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>SecondMax=new ArrayList<>();
        System.out.println("Enter your size");
        int n=sc.nextInt();
        System.out.println("Enter your element");
        for(int i=0;i<n;i++){
            SecondMax.add(sc.nextInt());
        }
      int max=-999;int secondmax=-999;
        for(int i=0;i<SecondMax.size();i++){
            if(SecondMax.get(i)>max){
                max=SecondMax.get(i);
                // System.out.println(max);
            }
        }
        for(int i=0;i<SecondMax.size();i++){
           if(SecondMax.get(i)>secondmax&&SecondMax.get(i)<max){
            secondmax=SecondMax.get(i);
           
           }
         
        }
        System.out.println( " First  highest no: "+max);
        System.out.println( " Second highest no: "+secondmax);
    }
}
