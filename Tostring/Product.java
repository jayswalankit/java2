import java.util.*;
public class Product {
    String name;
    float price;
   Product(String name,float price){
    this.name=name;
    this.price=price;
   }
    @Override
    public String toString(){
        return "product name is\s "+name+" price is\s "+price;
    }
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Product obj=new Product(null, 0);
    System.out.println("enter product name");
    obj.name=sc.nextLine();
    System.out.println("enter your price");
    obj.price=sc.nextFloat();

    System.out.println(obj);

 }
   
  
}
