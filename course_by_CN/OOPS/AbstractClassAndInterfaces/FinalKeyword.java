// // Day 8(31-01-2024)
// final keyword, abstract class

package course_by_CN.OOPS.AbstractClassAndInterfaces;


final class Vehicle1 {
    // this class cannot be inherited
}


abstract class Vehicle {

    Vehicle(){
        System.out.println("Vehicle");
    }

    // this method cannot be overriden
    final void print() {
        System.out.println("Vehicle class");
    }

    // an abstract method
    public abstract boolean isMotorised();
    
    public abstract String getCompany();
}

abstract class Car extends Vehicle{

    Car(){
        System.out.println("Car");
    }

    @Override
    public boolean isMotorised() {
        return true;
    }

}

class BMW extends Car{

    @Override
    public String getCompany() {
        return "BMW";
    }
    
}

abstract class Bicycle extends Vehicle{

    @Override
    public boolean isMotorised() {
        return false;
    }

}

abstract class Truck extends Vehicle{

}

public class FinalKeyword {
    public static void main(String[] args) {

        // Vehicle v = new Vehicle(); not able to make the object of the incomplete class
        // Vehicle v; is valid
        Car c = new BMW();
        System.out.println(c.isMotorised());

    }
}
