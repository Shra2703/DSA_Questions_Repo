package course_by_CN.OOPS.ExceptionHandling;

// Day 7(30-01-2024)
// EXception handling

public class ExceptionDemo {
    public static int divide(int a, int b) throws DivideByZero {
        if (b == 0) {
            // throw new ArithmeticException();
            throw new DivideByZero();
        }
        return a / b;
    }

    public static boolean isNegative(int a) throws NumberIsNegativeNum {
        if (a < 0) {
            throw new NumberIsNegativeNum();
        }
        return false;
    }

    // Throws the exception
    // public static void main(String[] args) throws DivideByZero{
    // divide(10, 0);
    // System.out.println("Not able to divide");
    // // statements after exception will not able to execute
    // }

    // in this we are handling the exception
    public static void main(String[] args) {
        try {
            divide(100, 10);
            isNegative(-23);
            System.out.println("Inside the try");
        } catch (DivideByZero e) {
            System.out.println("inside the catch block");
        } catch (NumberIsNegativeNum e) {
            System.out.println("Number is a negative num");
        } catch (Exception e) {
            System.out.println("May be a exception");
        } finally {
            System.out.println("Always executed whether the try executed or catch executed");
        }
        System.out.println("main");
    }
}
