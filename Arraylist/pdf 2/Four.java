import java.util.*;

public class Four {
    public void rev(){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();
        System.out.println("enter your size");
        int a=sc.nextInt();
    for(int i=0;i<a;i++){
        arr.add(sc.nextInt());
      
    }
    // Integer[] arr1 = arr.toArray(new Integer[arr.size()]);
    int[] arr1 = new int[arr.size()];
    for(int i=0;i<arr.size();i++){
              arr1[i]=arr.get(i);
    }
    }
   

    public static void main(String[] args) {
   Four obj=new Four();
   obj.rev();

    }
}
