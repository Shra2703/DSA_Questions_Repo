package course_by_CN.Recursion;

public class LastIndexOFArrya {
    // #1
    static int li = -1;
    public static int lastIndexInner(int arr[], int x, int si){
        if(si == arr.length) return  li;
        if(arr[si] == x){
            li = si;
        }
        int smallArray = lastIndexInner(arr, x, si + 1);
        return smallArray;
    }

    // #2
    public static int lastIndexInner2(int arr[], int x, int si){
        if(si == arr.length) return  -1;
        int smallArrayOutput = lastIndexInner(arr, x, si + 1);
        if(smallArrayOutput != -1) return smallArrayOutput;
        if(arr[si] == x) return si;
        else return -1;
    }

	public static int lastIndex(int input[], int x) {
		return lastIndexInner(input, x,0);
	}
}
