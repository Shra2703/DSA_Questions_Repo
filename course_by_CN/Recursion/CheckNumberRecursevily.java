// Day 2(20-01-2024)
// check the number recursevily


package course_by_CN.Recursion;

public class CheckNumberRecursevily {
    public static boolean checkNumber(int input[], int x) {
		if(input.length == 0) return false;
		if(input[0] == x) return true;

		int temp[] = new int[input.length - 1];
		for(int i =  1 ; i < input.length ; i++){
			temp[i-1] = input[i];
		}
		return checkNumber(temp, x);
		
	}
}
