// Day 2 (10-01-2023)
// Highest occuring element of the array

package course_by_CN.strings;

public class HighestOccurringChar {
    public static char highestOccuringChar(String str) {
        // Your code goes here
        if (str.length() == 0)
            return ' ';
        if (str.length() == 1)
            return str.charAt(0);

        int[] temp = new int[26];
        int max = -1;
        char ans = ' ';
        for (int i = 0; i < str.length(); i++) {
            int index = (int) str.charAt(i) - 97;
            temp[index]++;
        }
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > max) {
                max = temp[i];
                ans = (char) (i + 97);
            }

        }
        return ans;
    }
}
