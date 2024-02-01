package course_by_CN.OOPS.Generics;
//  Day 9(1-02-2024)
//  generics methods, bound generics

public class GenericsMethod {

    // no bound fenerics
    // this for other data types
    public static<T> void printArray(T arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
    }

    // bound generics
    // this is for objects like vehicle
    public static<T extends Vehicle> void printArray(T arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            arr[i].print();
        }
    }
    public static void main(String[] args) {
        
        Integer arr[] = {1,2,3,4,5};
        printArray(arr);

        String arr1[] = {"a","b","c","d"};
        printArray(arr1);

        Vehicle v[] = new Vehicle[5];
        System.out.println(v);
        
        for(int i = 0 ; i < v.length ; i++){
            v[i]  = new Vehicle(100 * i, "ab");
        }
        printArray(v);

    }
}
