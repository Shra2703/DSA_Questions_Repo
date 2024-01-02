public class basic1 {
     // functions to print the array
     public static void printArray(int []arr){
        for(int i = 0 ;i < arr.length ;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void incrementArray(int []arr){
        for(int i = 0 ;i < arr.length ;i++){
            arr[i] += 1;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.println(arr); //non-primitive data types stores the reference not the actual value
        printArray(arr);
        incrementArray(arr);
        printArray(arr); //in non-primitives the refrence is passed so the by pass by vlaue the value of the array changes


    }
    
}
