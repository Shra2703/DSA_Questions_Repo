// Day 5(28-01-2024)
// Classes and objects
// Access Modifiers: Public = accessible anywhere, Default = accessible within the same package, private = accessible within the same class

class Student{
    String name;
    int rollNo;
    private int rollNo1;

    public int getRollno(){
        return rollNo1;
    }

    public void setRollno(int num){
        if(num < 0) return;

        rollNo1 = num;
    }
}

public class StudentUse{
    public static void main(String[] args) {
        // making objects of that class
        Student s1 = new Student();  // each object will assign the different block of memory
        Student s2 = new Student();

        
        System.out.println(s1);
        // accessing the properties of class
        s1.name = "Shraddha";   //writing the properties
        s1.rollNo = 157;
        System.out.println(s2.name + " " + s2.rollNo); //reading the properties

        System.out.println(s1.getRollno());
        
    }
}