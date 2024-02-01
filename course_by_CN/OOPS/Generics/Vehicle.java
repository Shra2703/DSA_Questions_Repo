package course_by_CN.OOPS.Generics;
public class Vehicle {
    int maxSpeed;
    String company;

    Vehicle(int maxSpeed, String comapany){
        this.maxSpeed =  maxSpeed;
        this.company = comapany;
    }

    void print(){
        System.out.println(this.maxSpeed + " " + this.company);
    }
}
