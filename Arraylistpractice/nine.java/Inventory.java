import java.util.*;


class Product {
    String productname;
    String productid;
    float quantity;

    Product(String productname,String productid,float quantity){
        this.productname=productname;
        this.productid=productid;
        this.quantity=quantity;
    }
    public void setProductname(String productname){
     this.productname=productname;
    }

    public String getProductname(){
        return productname;
    }

    public void setProductid(String productid){
        this.productid=productid;
       }
   
       public String getProductid(){
           return productid;
       }

       public void setQuantity(float quantity){
        this.quantity=quantity;
       }
   
       public float getQuantity(){
           return quantity;
       }
  public String toString(){
    return "Product name: "+productname+" product id: "+productid+" net weight "+quantity;
  }
     
}

public class Inventory extends Product{

    List<Product>inventory=new ArrayList<>();
    Inventory(String productname,String productid,float quantity){
        super(productname, productid, quantity);
    }

    public void add(){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter no of product you want to add");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
             System.out.println("Enter your product name");
             String name=sc.next();

             System.out.println("Enter your product id");
             String id=sc.next();
           

             System.out.println("enter net weight");
             float quantity=sc.nextFloat();

             inventory.add(new Product(name, id, quantity));
        }
    }

    public void update(){
        Scanner sc=new Scanner (System.in);
        // System.out.println("Enter no of product you want to  update");
        // int update=sc.nextInt();
        // sc.nextLine();
           
        System.out.println("Enter product id you want to change quantity");
            String checkid=sc.nextLine();
        boolean found=false;

        for(int i=0;i<inventory.size();i++){
            

            if(inventory.get(i).productid.contains(checkid)){
                System.out.println("enter new quantity");
                float newquantity=sc.nextFloat();
                inventory.get(i).setQuantity(newquantity);
                found =true;
                System.out.println("changed");
                break;
            }

        }
          
        if(found=false){
            System.out.println("Product id not found");
        }
       

        
    }
    public void display(){
       for(Product pro:inventory){
        System.out.println(pro);
       }
     }
      
    public static void main(String[] args) {
        Inventory obj=new Inventory(null, null, 0);
        obj.add();
        obj.display();
        obj.update();
        obj.display();
    }  

}
