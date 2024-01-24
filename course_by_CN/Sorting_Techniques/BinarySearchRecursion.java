package course_by_CN.Sorting_Techniques;
// Day 4(24-01-2024)
// Binary Search using recursion
public class BinarySearchRecursion {
    public static int binarySearchRecursion(int[] arr, int start, int end, int num) {
        if (start > end)
            return -1;
        int mid = (start + end) / 2;
        if(arr[mid] == num) return mid;
        else if(arr[mid] > num) return binarySearchRecursion(arr, start, mid - 1, num);
        else return binarySearchRecursion(arr, mid + 1, end, num);

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,5,6};
        System.out.println(binarySearchRecursion(arr, 0, arr.length -1, 5));

    }
}
