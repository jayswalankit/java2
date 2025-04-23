import java.util.*;
class InvalidEmailException extends Exception{
public   InvalidEmailException(String messege){
    super(messege);
}
    }

public class Six {
   String email;
  public Six (String email) throws InvalidEmailException {
    this.email = email;
    if (!email.contains("@") && !email.contains(".")) {
        throw new InvalidEmailException("Invalid email format"+email);
    }
  }

  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    try {
        
        System.out.println("enter your email");
        String str= sc.nextLine();
        Six obj = new Six("");
       
    } catch (InvalidEmailException e) {
        System.out.println("Exception caught: " + e.getMessage());
    }
  }
}
