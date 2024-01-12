// Day 1 (12-01-2023)
// Compress the string

package course_by_CN.strings;

public class compressTheString {
    public static String getCompressedString(String str) {
        // Write your code here.
        if (str.length() == 0)
            return str;

        String newStr = "";
        newStr += str.charAt(0);
        int k = 0;
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (newStr.charAt(k) == str.charAt(i)) {
                count++;
            } else {
                if (count != 1) {
                    newStr = newStr + count + str.charAt(i);
                    k = k + 2;
                } else {
                    newStr = newStr + str.charAt(i);
                    k = k + 1;
                }
                count = 1;
            }

        }
        if (count != 1)
            newStr = newStr + count;

        return newStr;
    }

}
