// Day 3
// Sum of 2 array

public class SumOf2Array {
    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	//Your code goes here
        int n = arr1.length;
        int m = arr2.length;
        int carry = 0;
        int i = n -1;
        int j = m-1;
        int r = output.length-1;
        while(i >=0 && j >= 0){
            int sum = arr1[i] + arr2[j] + carry;
            carry = sum / 10;
            output[r] = sum % 10;
            r--;
            i--;
            j--;
        }
      
        while(i >=0){
            int sum = arr1[i] + carry;
            carry = sum / 10;
            output[r] = sum % 10;
            r--;
            i--;
        }
         while(j >=0){
            int sum = arr2[j] + carry;
            carry = sum / 10;
            output[r] = sum % 10;
            r--;
            j--;
        }
          if(i <0 && j<0) output[0] = carry;
    }
}
