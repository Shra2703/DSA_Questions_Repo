// Day 3(21-01-2024)
// Pair Star

package course_by_CN.Recursion;

public class PairStar {
    public static String addStarsInner(String str){
		if(str.length() == 0 ) return str; 
		String smallOutput = addStarsInner(str.substring(1));
		if(str.length() >1 && str.charAt(0) == str.charAt(1)) return str.charAt(0) + "*" + smallOutput;
		else return str.charAt(0) + smallOutput;
	}
}
