package course_by_CN.ClassesAndObjects;
// Day 5(28-01-2024)
// Classes and objects
// Access Modifiers: Public = accessible anywhere, Default = accessible within the same package, private = accessible within the same class

// Day 6(29-01-2024)
// this keyword and getters, setters
// this, static and final keyword

class Student {
    String name;
    int rollNo;
    private int rollNo1;
    static int noOfStudents; //static keyword is class keyword when we static on variable the all the objects will have the same memory can acccess by the class name;

    Student(){
        noOfStudents++;
    }

    // getters
    public int getRollno() {
        return rollNo1;

    }

    // setters
    public void setRollno(int num) {
        if (num < 0)
            return;

        // this refers to the current object which the function is called
        System.out.println("this " + this);
        System.out.println(noOfStudents);
        rollNo1 = num;
    }

    // in static function we can only access static variables and static functions only
    public static int getNoOfStudents(){
        return noOfStudents;
    }
}

class Employee {
    final String empName;
    int empID;
    final double conversionFactor = 0.98; // final keyword is like constant in ither languages and we can assign the
                                          // value at the tme of intialization or at the time of creating the
                                          // constructore because constructor only call at once.

    // costructors and constructor overloading
    public Employee() {
        this("Vikky", 2210); // this can be used to call the constructor within the same class
        System.out.println("Constructors with 2 argument");
    }

    public Employee(String empName) {
        this.empName = empName;
    }

    public Employee(String empName, int id) {
        this.empName = empName;
        empID = id;
    }
}

public class StudentUse {
    public static void main(String[] args) {

        // #Student
        // making objects of that class
        Student s1 = new Student(); // each object will assign the different block of memory
        Student s2 = new Student();

        System.out.println("s1 " + s1);
        // accessing the properties of class
        s1.name = "Shraddha"; // writing the properties
        s1.rollNo = 157;
        System.out.println(s2.name + " " + s2.rollNo); // reading the properties

        s1.setRollno(10);
        System.out.println(s1.getRollno());
        Student.noOfStudents = 3; //wrting the static variable
        System.out.println("Static " + Student.noOfStudents); //reading the static variable

        // #emplyee
        Employee e1 = new Employee("shraddha");
        Employee e2 = new Employee("Shraddha", 157);

        System.out.println(e1.empName);
        System.out.println(e2.empID);

    }
}