// Day 2 (10-01-2023)
// Check permutation of the string

package course_by_CN.strings;

public class CheckPermutationInTheString {
    public static boolean isPermutation(String str1, String str2) {
        // Your code goes here
        if (str1.length() != str2.length())
            return false;

        int[] temp = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            int index = (int) str1.charAt(i) - 97;
            // System.out.println(index);
            temp[index]++;

        }
        for (int i = 0; i < str1.length(); i++) {
            int index = (int) str2.charAt(i) - 97;
            temp[index]--;

        }
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != 0)
                return false;

        }
        return true;
    }
}
