package LinearSearchQuestions;
// #2
// Searching in the String

import java.util.Arrays;

public class SearchInAString {
    public static void main(String[] args) {
        String name = "Shraddha";
        char target = 'z';
        System.out.println(search1(name, target));
        
    }

    // using the simple for loop
    static boolean search1(String str, char target){
        if(str.length() == 0) return false;
        System.out.println(Arrays.toString(str.toCharArray() ));
        for(char element: str.toCharArray()){
            if(target == element) return true;
        }
        return false;
    }


    // using the simple for loop
    static boolean search(String str, char target){
        if(str.length() == 0) return false;
        for(int i = 0 ; i < str.length(); i++){
            if(target == str.charAt(i)) return true;
        }
        return false;
    }
}
