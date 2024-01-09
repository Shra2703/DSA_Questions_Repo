// Day 1 (09-01-2023)
// Print all the charachter in the string


package course_by_CN.strings;
import java.util.Scanner;

public class PrintAllChars {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        // printing all the charchters
        for(int i = 0 ; i < str.length(); i++){
            System.out.println(str.charAt(i));
        }
    }
}
