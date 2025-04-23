import java.util.*;

class product{
String product ;
float price;

product(String product,float price){
    this.product=product;
    this.price=price;
}
// public void  display(){
//    System.out.println("prodect name: "+product+" price:  "+price);
// }
public String toString(){
   return "product: "+product+" price: "+price;
}
}

 public class Manager{
   
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter how much item sou have");
    int n=sc.nextInt();
    sc.nextLine();
    product max=null;
    for(int i=0;i<n;i++){
        System.out.println("enter product name");
     String name=sc.nextLine();
     System.out.println("enter your price");
     float price=sc.nextFloat();
     sc.nextLine();
    
    product obj=new product(name,price);
    obj.display();
    if(max==null||price>=max.price){
        max=obj;
    }
   }
   System.out.println("highest price: "+max);
   // max.display();
}
   }









// import java.util.*;

// class Product {
//     String product;
//     float price;

//     Product(String product, float price) {
//         this.product = product;
//         this.price = price;
//     }

//     public void display() {
//         System.out.println("Product name: " + product + " | Price: " + price);
//     }
// }

// public class Manager {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter how many items you have:");
//         int n = sc.nextInt();
//         sc.nextLine(); // Consume newline

//         Product max = null;

//         for (int i = 0; i < n; i++) {
//             System.out.println("Enter product name:");
//             String name = sc.nextLine();
//             System.out.println("Enter product price:");
//             float price = sc.nextFloat();
//             sc.nextLine(); // Consume newline

//             Product obj = new Product(name, price);
//             obj.display();

//             if (max == null || price >= max.price) {
//                 max = obj;
//             }
//         }

//         if (max != null) {
//             System.out.println("Highest priced product:");
//             max.display();
//         }

//         sc.close();
//     }
// }