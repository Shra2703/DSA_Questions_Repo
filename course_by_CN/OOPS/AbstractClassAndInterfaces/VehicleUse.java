package course_by_CN.OOPS.AbstractClassAndInterfaces;
interface VehicleInterface {

    // by default public abstract
    boolean isMotorised();

    String getCompany();

}

class Vehicle implements VehicleInterface {

    Vehicle() {
        System.out.println("Vehicle Use");
    }

    @Override
    public boolean isMotorised() {
        return true;
    }

    @Override
    public String getCompany() {
        return "BMW";
    }

    public void print() {
        System.out.println("Vehicle class");
    }
}

public class VehicleUse {
    public static void main(String[] args) {

        // not able to make a object of interface but can make the refrence of it
        VehicleInterface v = new Vehicle();
        v.isMotorised();
        v.getClass();
        // v.print(); not able to access it

    }
}
