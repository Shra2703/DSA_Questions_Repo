package course_by_CN.Recursion;
// Day 3(21-01-2024)
// replace the char x with y in the string

public class ReplaceChar {
    public static void main(String[] args) {
        String str = "absdfg";
        System.out.println(replaceChar(str, 'x', 'y'));
    }

    private static String replaceChar(String str, char c, char d) {
        if(str.length() == 0) return str;

        String smallOutput = replaceChar(str.substring(1), c, d);
        if(str.charAt(0) == c) return d + smallOutput;
        else return str.charAt(0) + smallOutput;
        
    }
}
