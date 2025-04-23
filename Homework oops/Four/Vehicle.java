public class Vehicle {
    String vehicleType;
    String model;
    int year;
    Vehicle(String vehicleType,String model){
     this.vehicleType=vehicleType;
     this.model=model;
    }
    Vehicle(String vehicleType,String model,int year){
        this.vehicleType=vehicleType;
        this.model=model;
        this.year=year;
    }
    public void displayInfo() {
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
    
    public static void main(String[] args) {
        Vehicle obj=new Vehicle("Car", "BMWM5");
        obj.displayInfo();
        Vehicle obj1=new Vehicle("Bike", "BMW1000R", 2008);
        obj1.displayInfo();

    }
    
}
