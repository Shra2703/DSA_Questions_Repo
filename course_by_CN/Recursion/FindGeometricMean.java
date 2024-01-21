// Day 3(21-01-2024)
// Find the geometric mean recursevily

package course_by_CN.Recursion;

public class FindGeometricMean {
    public static double findGeometricSum(int k){
		// Write your code here
        if(k == 0) return 1;


		double smallOutput = findGeometricSum(k - 1);
		double output = smallOutput + (1 / Math.pow(2,k));
		return output;

	}
}
