// Day3 
// Sort 0 1 2

public class Sort012 {
    public static void sort012(int[] arr){
    	//Your code goes here
        int zero = 0, one = 0, i= 0;
        while(i < arr.length){
            if(arr[i] == 0) zero++;
            else if(arr[i] == 1) one++;
            
            i++;
        }
        for(i = 0; i < zero; i++) arr[i] = 0;       
        for(i = zero; i < zero + one; i++) arr[i] = 1;
        for(i = zero+one; i < arr.length; i++) arr[i] = 2;


    }
}
