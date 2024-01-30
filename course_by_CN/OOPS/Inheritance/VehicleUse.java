package course_by_CN.OOPS.Inheritance;
// Day 7(30-01-2024)
// Inheritance: super keyword, construcotr in inheritance, overriding, protected

class Vehicle{
    String color;
    int maxSpeed;
    private String company; //private properties or functions will not have the direct access to the inheriting class, we can access it by getters or setters
    protected int seats;  //protected data members are visible within the same package in derived and non=derived class and it is visible in the derived class in different package as well

    // vehicle constructor
    Vehicle(int maxspeed){
        System.out.println("Vehicle's constructor ");
    }

    String getComapany() {
        return this.company;
    }

    void setComapny(String name){
        this.company = name;
    }
    
    void print(){
        System.out.println("Vehicle color " + color + " maxspeed " + maxSpeed);
    }
}

class Car extends Vehicle{
    int doors;
    // int maxSpeed;

    // car constructor
    Car(int maxSpeed){
        super(maxSpeed);
        System.out.println("Car's constructor ");
    }

    // we are overriding the print function in car class
    void print(){
        super.print(); //super keyowrd is used to access parent class properties and functions
        super.maxSpeed = 190;
        System.out.println("Car color " + color + " maxspeed " + maxSpeed + " company " + getComapany());
    }

    

}

public class VehicleUse {
    public static void main(String[] args) {
        Car  c = new Car(100);
        c.color = "Red";
        c.maxSpeed = 100;
        // c.company() throws an error because of private member
        c.setComapny("Audi");
        c.print();

        
    }
}
