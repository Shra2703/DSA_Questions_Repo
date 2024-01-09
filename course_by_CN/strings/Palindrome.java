// Day 1 (09-01-2023)
// whether the string is the palindrom or not method 1

package course_by_CN.strings;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        System.out.println("Original String: "+ str);
        // Reverse a String
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            newStr = str.charAt(i) + newStr;
        }
        System.out.println("Reverse String: " + newStr);

        if (newStr.equals(str))
            System.out.println("String is the palindroms");
        else
            System.out.println("String is not the palindrome");
    }
}
