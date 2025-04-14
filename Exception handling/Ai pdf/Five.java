// Write a program to handle different exceptions:
// ArithmeticException , 
// ArrayIndexOutOfBoundsException , and
// NumberFormatException in the same code using multiple 
// blocks

import java.util.*;
public class Five {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of divide ");
        int n=sc.nextInt();
        int a=sc.nextInt();
        System.out.println("enter the size");
        int size=sc.nextInt();
        int [] arr=new int[size];
        System.out.println("ener element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
           System.out.println("String convert");
        String str="abc123";
        try {
            int c=n/a;
            System.out.println(c);

          System.out.println("enter the no if index");
          int b=sc.nextInt();
           System.out.println(arr[b]);

           int s=Integer.parseInt(str);
           System.out.println(s);

            
        } catch (ArithmeticException e) {
           System.out.println("fix the Arithematic exception");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds");
        
    }
    catch(NumberFormatException e){
        System.out.println("Fix the formate Exception");
    }

    finally{
        System.out.println("completed");
    }
}
}










