// Day 3(21-01-2024)
// Count zeros in digit

package course_by_CN.Recursion;

public class countZeros {
    public static int countZerosRec(int input){
		// Write your code here
        if(input < 10) if(input % 10 == 0) return 1; else return 0;

        if(input % 10 == 0) return 1 + countZerosRec(input / 10);
        else return countZerosRec(input / 10);


	}
}
