// Day 4
// (15-01-2024)
// Faulty keyboard problem

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class FaultyKeyboard {

    static class Pair {
        char currChar;
        int currCharCount;

        Pair(char currChar, int currCharCount) {
            this.currChar = currChar;
            this.currCharCount = currCharCount;
        }
    }

    public static List<Pair> makegroups(String s1) {
        List<Pair> ret = new ArrayList<>();
        char currChar = s1.charAt(0);
        int currCharCount = 1;

        for (int i = 1; i < s1.length(); i++) {
            if (s1.charAt(i) == currChar)
                currCharCount++;
            else {
                ret.add(new Pair(currChar, currCharCount));
                currCharCount = 1;
                currChar = s1.charAt(i);
            }
        }

        ret.add(new Pair(currChar, currCharCount));
        return ret;

    }

    public static boolean canType(String s1, String s2) {
        List<Pair> group1 = makegroups(s1);
        List<Pair> group2 = makegroups(s2);

        if (group1.size() != group2.size())
            return false;
        for (int i = 0; i < group1.size(); i++) {
            if (group1.get(i).currChar != group2.get(i).currChar)
                return false;
            if (group1.get(i).currCharCount > group2.get(i).currCharCount)
                return false;
        }
        return true;

    }

    public static void main(String[] args) {
        // Write your code here
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int i;
        for (i = 0; i < n; i++) {
            String s1 = s.next();
            String s2 = s.next();
            System.out.println(canType(s1, s2) ? "true" : "false");
        }

    }
}
