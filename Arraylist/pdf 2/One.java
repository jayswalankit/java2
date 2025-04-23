// import java.util.*;
// public class One {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         ArrayList<Integer>number=new ArrayList<>();
//         System.out.println("enter your size");
//         int n=sc.nextInt();
        
//         for(int i=0;i<n;i++){
//             int no=sc.nextInt();
//             number.add(no); 
//         }
      
//         outerloop: for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
              
//                 if(i!=j&&number.get(i).equals(number.get(j))){
                        
//                         continue outerloop ;
           
           
//                 }
               
//             }
//             System.out.println("result");
//                 System.out.println(number.get(i));
//         }
        
//         }
//     }



import java.util.*;
public class One {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>number=new ArrayList<>();
        System.out.println("enter your size");
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++){
            int no=sc.nextInt();
            number.add(no); 
        }
      
       for(int i=0;i<number.size();i++){
            for(int j=0;j<number.size();j++){
              
                if(i!=j&&number.get(i).equals(number.get(j))){
                        
                       number.remove(j);
           
           
                }
               
            }
            
            System.out.println("result");
                System.out.println(number.get(i));
        }
        }
    }




