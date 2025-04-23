// import java.util.*;
// public class nine {
//     public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter your size");
//        int n=sc.nextInt();
//        System.out.println("Enter your array");
//        int[]arr=new int[n];
//     for(int i=0;i<arr.length;i++){
//         arr[i]=sc.nextInt();
//     }
//    boolean a=true;
//     for(int i=0;i<arr.length;i++){
//         int tem=0,rev=0,num=arr[i];
      
//       for( tem=num;tem!=0;tem/=10){
//        int rem=tem%10;
//         rev=rem+(rev*10);
//       }
//       if(rev!=num){
//         a=false;
//         break;
//     }
    
//     }
//     if(a==true){
//         System.out.println("yes");
//     }
//     else{
//         System.out.println("no");
//     }
    
   
//     }
// }









import java.util.*;

public class nine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the size of the array
        System.out.println("Enter your size");
        int n = sc.nextInt();
        
        // Input the array elements
        System.out.println("Enter your array");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        boolean isAllPalindrome = true; // Start by assuming all numbers are palindromes
        
        for (int i = 0; i < arr.length/2; i++) {
            int num = arr[i];
            int reverse = 0;
            int temp = num;
            
            // Reverse the number
            while (temp != 0) {
                int remainder = temp % 10;
                reverse = reverse * 10 + remainder;
                temp /= 10;
            }
            
            // Check if the number is not a palindrome
            if (reverse != num) {
                isAllPalindrome = false; // Flag that not all numbers are palindromes
                break; // Exit the loop early
            }
        }
        
        // Output the result
        if (isAllPalindrome) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}