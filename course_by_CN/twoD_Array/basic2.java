// day 4
// basis of 2d array

package course_by_CN.twoD_Array;
public class basic2 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        System.out.println(arr[0][0]); // by default value is 0

        int[][] arr1 = new int[2][]; // can do this fill with null in the rows
        System.out.println(arr1[0]); //gives null
        // sysout(arr1[0][0]) give null pointer exception

        for(int i = 0 ; i < arr1.length ; i++){
            arr1[i] = new int[4];
        }

        // can also do this when each row has different size array i.e jagged array
        for(int i = 0 ; i < arr1.length ; i++){
            arr1[i] = new int[i+2];
        }

    }
}
