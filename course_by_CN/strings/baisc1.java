// Day 1 (09-01-2023)
// Storage of strings in the memory area.
// non primitive datatypes are stores in heap only refreces strres in stack
package course_by_CN.strings;
public class baisc1 {
    public static void main(String[] args) {
        String str = "Shraddha"; //stores in heap and in heap it stores in the string pool
        String str1 = "Shraddha"; //Stores in string pool both of these 2 having the same value so both the variable will have the same refrence.

        String str2 = new String("Aditya"); //stores in the heap but stores outside the string pool
        String str3 = new String("Aditya"); //stores outside the string pool, having same value but the refrence is also different.

        // StringBuffer mutable version of string
        StringBuffer str5 = new StringBuffer("Abg");
        str5.setCharAt(0,'a');
        System.out.println(str5);
        

    }
}
