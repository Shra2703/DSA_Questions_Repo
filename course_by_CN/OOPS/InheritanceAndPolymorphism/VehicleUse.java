package course_by_CN.OOPS.InheritanceAndPolymorphism;
// Day 7(30-01-2024)
// Inheritance: super keyword, construcotr in inheritance, overriding, protected
// Polymorphism: runtime, compile time
// class cast, object class

class Vehicle {
    String color;
    int maxSpeed;
    private String company; // private properties or functions will not have the direct access to the
                            // inheriting class, we can access it by getters or setters
    protected int seats; // protected data members are visible within the same package in derived and
                         // non=derived class and it is visible in the derived class in different package
                         // as well

    // vehicle constructor
    Vehicle(int maxspeed) {
        System.out.println("Vehicle's constructor ");
    }

    String getComapany() {
        return this.company;
    }

    void setComapny(String name) {
        this.company = name;
    }

    void print() {
        System.out.println("Vehicle color " + color + " maxspeed " + maxSpeed);
    }
}

class Car extends Vehicle {
    int doors;
    // int maxSpeed;

    // car constructor
    Car(int maxSpeed) {
        super(maxSpeed);
        System.out.println("Car's constructor ");
    }

    // we are overriding the print function in car class
    void print() {
        super.print(); // super keyowrd is used to access parent class properties and functions
        super.maxSpeed = 190;
        System.out.println("Car color " + color + " maxspeed " + maxSpeed + " company " + getComapany());
    }

}

class Bicycle extends Vehicle{
    Bicycle(int maxSpeed){
        super(maxSpeed);
    }

}

public class VehicleUse {
    public static void main(String[] args) {

        // Inheritance
        Car c = new Car(100);
        c.color = "Red";
        c.maxSpeed = 100;
        // c.company() throws an error because of private member
        c.setComapny("Audi");
        c.print();

        // Polymorphism

        // # we can do this that the refrence of vehicle v can point to their children
        // and we can access the properties and function of vehicle but we can't access
        // the properties of their children
        Vehicle v = new Car(100);
        v.color = "Black";
        // v.doors = 4 throws an error because later we can change the refrence to their
        // other children. checking this happens at compile time
        v.print(); // this will call the car() print because this happens at runtime


        // Car c1 =  new Vehicle(120); this can not be done
        v = new Bicycle(130);
        Car c1 = (Car) v; //this is dangerous becase this is correct at compile but at runtime it will throw an error because it may be possible that latter on we change the vehicle refrence
        
        // Object class is the super class of all the classes
        Object o = new Vehicle(190);

    }
}
