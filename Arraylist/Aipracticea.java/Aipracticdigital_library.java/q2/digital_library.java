
// Create a parent class Library with a method that displays books stored in an array. Extend it into a child class DigitalLibrary that uses an ArrayList to store and display eBooks. Demonstrate polymorphism in your solution.
import java.util.*;

 class library {
    String []books;
    library(String[] books){
        this.books=books;
    }
    public String display(){
        Scanner sc=new Scanner(System.in);
        int n = books.length; // Initialize n with the length of the books array
         for(int i=0;i<n;i++){
          System.out.println(books[i]); // Access individual book by index
         }
         return Arrays.toString(books);
    }
}

public class digital_library extends library{
    ArrayList<String> ebooks;
     public digital_library(String []books,ArrayList<String>ebooks){
      super(books);
      this.ebooks=ebooks;
    }
    public String display(){
        Scanner sc=new Scanner(System.in);
        for(String a : ebooks){
           System.out.println(ebooks);
        }
        return ebooks.toString();
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your no");
      int n=sc.nextInt();
      String [] librarybooks=new String[n];
      for(int i=0;i<n;i++){
        librarybooks[i]=sc.nextLine();
      }
          
      System.out.println("enter the no of e-books");
      int m=sc.nextInt();
      sc.nextLine();
     ArrayList<String>digitalBooks=new ArrayList<>();
     for(int i=0;i<m;i++){
        digitalBooks.add(sc.nextLine());
     }
     library obj=new library(librarybooks);

    digital_library obj1=new digital_library(librarybooks, digitalBooks);

        obj.display();
        obj1.display();
    }
}
