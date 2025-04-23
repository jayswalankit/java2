import java.util.*;

 class Vehicle {
    String VehicleType;
    String VehicleName;

    Vehicle(String VehicleType,String VehicleName){
        this.VehicleType=VehicleType;
        this.VehicleName=VehicleName;
    }
}

public class Carr extends Vehicle{
    Carr(String VehicleType,String VehicleName){
        super(VehicleType, VehicleName);
    }
    public String toString(){
        return "My "+VehicleType+" is "+VehicleName;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
       Vehicle obj=new Carr(null, null);
        System.out.println("Enterr your vehicle type");
        obj.VehicleType=sc.nextLine();
        System.out.println("Enter your vehicle name");
        obj.VehicleName=sc.nextLine();
        System.out.println(obj);
        
    }
}
