import java.util.*;

public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your String");

        String a = sc.nextLine();

        int vowelcount = 0, constantcount = 0, digitscount = 0,specialCharactersCount=0;

        a = a.toLowerCase();

       for(int i=0;i<a.length();i++){

      char ch=a.charAt(i);

      if(ch>='a'&&ch<='z'){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            vowelcount++;
          }
          else{
            constantcount++;
          }
          
      }
      else if(ch>='0'&&ch<='9'){
        digitscount++;
      }
      else{
        specialCharactersCount++;
      }
     
       }
       System.out.println("The vowel count: "+vowelcount);
       System.out.println("The constant count: "+constantcount);
       System.out.println("The digit count: "+digitscount);
       System.out.println("The special Characters count: "+specialCharactersCount);
    }
}
