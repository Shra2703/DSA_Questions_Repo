// Day 2(20-01-2024)
// Getting the first index recursvely

package course_by_CN.Recursion;

public class FirstIndexREcurively {
    public static int firstIndexInner(int arr[], int x, int si){
        if(si == arr.length) return -1;
        if(arr[si] == x) return si;

        int smallSortedArray = firstIndexInner(arr, x, si + 1);
        return smallSortedArray;
    }

	public static int firstIndex(int input[], int x) {
		return firstIndexInner(input, x , 0);
		
	}
}
