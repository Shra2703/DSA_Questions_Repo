// Day 1 (09-01-2023)
// REverse the string in java

package course_by_CN.strings;
import java.util.Scanner;

public class ReverseSring {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String str = s.nextLine();

        System.out.println(str);
        // Reverse a String
        String newStr = "";
        for(int i = 0 ; i < str.length() ; i++){
            newStr = str.charAt(i) + newStr;
        }

        System.out.println(newStr);
    }
}
