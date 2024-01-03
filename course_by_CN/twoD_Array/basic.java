package course_by_CN.twoD_Array;
// Day 3
// 2d array
// basic of 2d array, how 2d array stored, input and output in 2d array


import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        int[][] arr = new int[2][2]; //intialization of 2d array
        System.out.println(arr[0][0]); //by default value of 2d array is 0
        //  System.out.println(arr[3][0]);    row index goes out of bound    
        //  System.out.println(arr[0][3]);    column index out of index
        int[][] arr1 = {{1,2},{3,4}}; // 2d array can be intilized like this also

        // 2d array is the array of arrays
        System.out.println(arr); // stores the refrence of the 2d array ex: [[I2134XXX
        System.out.println(arr.length);  //gives the length of arr which is no of rows       
        System.out.println(arr[0]); //gives the refrence of the 1d array that stores




        Scanner s = new Scanner(System.in);
        // taking the input in the 2 d array
        for(int i = 0 ; i < 2; i++){
            for(int j = 0; j< 2;j++){
                System.out.print("Enter the element at "+i+"th row and "+j+"th column:");
                arr[i][j] = s.nextInt();
            }
        }
        // printing the 2 d array
        for(int i = 0 ; i < 2; i++){
            for(int j = 0; j< 2;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }



        
    }
}
