// Coding Ninajs problem
// Sample Input 1 : 6
// Sample Output 1 : 1 3 5 6 4 2
import java.lang.Math;

public class ArrangeNumberInArray {

    public static void arrange(int[] arr, int n) {
        // Your code goes here
        int even = arr.length - 1;
        int odd = 0;
        int i = 1;
        while (odd <= even) {
            if (i % 2 == 0) {
                arr[even] = i;
                even--;
            } else {
                arr[odd] = i;
                odd++;
            }
            i++;
        }

    }

}
