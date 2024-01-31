package course_by_CN.OOPS.AbstractClassAndInterfaces;
// Day 8(31-01-2024)
// Interfaces


interface C {
    // by default it is public static and final
    int no = 23;

    void func();
}

interface D {
    int no =10;
    void func();
    void fuc1();

}

// multiple inheritance
class B implements C, D {

    @Override
    public void fuc1() {
        System.out.println("from C");
    }

    @Override
    public void func() {
        System.out.println("from D");
    }

    void print(){
        // System.out.println(no); can not use this
    }

}

interface E extends C{
   void func2();
}

class F implements E{

    @Override
    public void func() {
        
    }

    @Override
    public void func2() {
       
    }
    
}

public class Ause {
    public static void main(String[] args) {

    }
}
