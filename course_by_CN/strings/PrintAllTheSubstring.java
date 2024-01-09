// Day 1 (09-01-2023)
// Print all the substring in the string

package course_by_CN.strings;

public class PrintAllTheSubstring {
    public static void printSubstrings(String str) {
		//Your code goes here

        if(str.length() == 0 || str.length() == 1){
            System.out.println(str);
            return;
        }
        for(int i = 0 ;i < str.length() ; i++){
            for(int j = i ; j < str.length() ;j++){
                System.out.println(str.substring(i , j+1));
            }
        }
	}
    
}
