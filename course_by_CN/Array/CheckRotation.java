// Day 3
// Check rotation in the array

public class CheckRotation {
    public static int arrayRotateCheck(int[] arr){
    	//Your code goes here
        for(int i = 0; i < arr.length- 1 ;i++){
            if(arr[i] > arr[i+1]) return i+1;
        }
        return 0;
    }
    
}
