package course_by_CN.strings;
// Day 5
// String in Data structures

import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        // String is the non Primitive data type, internally stores in the form of charachter array.
        String str = "Shradddha";
        String str1 = ""; //empty string length 0        
        String str2 = " "; //empty string length 1


        System.out.println(str.length());
        System.out.println(str.charAt(0)); //can able to access the particular variable
        // syout(str.charAt(-1)) gives index out of bound exception

        str1 = "Coding";
        str2 = " is fun";
        // 3 ways to concatenate the string
        System.out.println(str1 + str2); //#1
        str1 += str2;                    //#2   
        System.out.println(str1);           

        // some functions
        System.out.println(str1.contains("ing"));
        System.out.println(str1.equals(str2)); //returns true or false
        System.out.println(str1.compareTo(str2)); //returns 0 if presents otherwise gives the ascii difference between the charachter value

        // Substring function
        System.out.println(str1.substring(2));        
        System.out.println(str1.substring(2,8)); //end index is exclusive
        System.out.println(str.substring(9)); //gives empty string
        System.out.println(str.substring(2,9));
        System.out.println(str1.substring(2,10)); //gives error

        // taking input in STring
        Scanner s = new Scanner(System.in);
        str1 = s.next(); //only take input upto 1st delimeter
        System.out.println(str1);
        str2 = s.next();
        System.out.println(str2); //after delimeter things will take

        String str3 = s.nextLine(); // will take the whole line
        System.out.println(str3);
    }
    
}
