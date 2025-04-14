
import java.util.*;
public class book {
   ArrayList<String>title;
   ArrayList<String>author;
   ArrayList<Integer>price;
book(){
    title = new ArrayList<>();
    author = new ArrayList<>();
    price = new ArrayList<>();
}
public ArrayList<String> gettitle(){
    return title;
}
public ArrayList<String> getauthor(){
    return author;
}
public ArrayList<Integer> getprice(){
    return price;
}
public void settitle(String name){
    title.add(name);
}
public void setauthor(String authorName){
    author.add(authorName);
}
public void setprice(int price){
    this.price.add(price);
}
public static void main(String[] args) {
    book obj = new book();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of books:");   
    int n = sc.nextInt();
    
    System.out.println("Enter book details:");
    sc.nextLine();
    for(int i=0;i<n;i++){
        obj.settitle(sc.nextLine());
        obj.setauthor(sc.nextLine());
        obj.setprice(sc.nextInt());
        sc.nextLine();
    }
    ArrayList<String> title = obj.gettitle();
    ArrayList<String> author = obj.getauthor();
    ArrayList<Integer> price = obj.getprice();
    for(int i=0;i<n;i++){
        System.out.println("Title: " + title.get(i) + ", Author: " + author.get(i) + ", Price: " + price.get(i));
    }

}
}








