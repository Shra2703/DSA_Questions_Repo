// Day 1 (12-01-2023)
// Minimum length word

public class MinimumLengthWord {
    public static String minLengthWord(String input) {
        if (input.length() == 1)
            return input;

        int minLength = 999999;
        String minString = "";
        String tempStr = "";
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                if (minLength > count) {
                    minLength = count;
                    minString = tempStr;
                    // System.out.println(tempStr);
                }
                count = 0;
                tempStr = "";
            } else {
                count++;
                tempStr += input.charAt(i);
            }

        }
        if (minLength > count) {
            minString = tempStr;
        }
        return minString;

    }
}
