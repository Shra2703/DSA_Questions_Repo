// Day 4(27-01-2024)
// Tower of hanoi

package course_by_CN.Recursion;

public class TowerOfHanoi {
    public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
        // Write your code here
        if (disks <= 0) {
            System.out.println(" ");
            return;
        }
        if (disks == 1) {
            System.out.println(source + " " + destination);
            return;
        }

        towerOfHanoi(disks - 1, source, destination, auxiliary);
        System.out.println(source + " " + destination);
        towerOfHanoi(disks - 1, auxiliary, source, destination);

    }
}
