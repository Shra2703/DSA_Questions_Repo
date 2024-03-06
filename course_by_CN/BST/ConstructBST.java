// Day 4 (05-03-2024)
// Construct BST using sorted array

package course_by_CN.BST;



public class ConstructBST {
    public static BinaryTreeNode<Integer> SortedArrayToBSTHelper(int[] arr, int start, int end) {
		if (start > end)
			return null;

		int mid = (end + start) / 2;
		int currData = arr[mid ];
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(currData);
		if (start == end)
			return root;
		BinaryTreeNode<Integer> leftST = SortedArrayToBSTHelper(arr, start, mid - 1);
		BinaryTreeNode<Integer> rightST = SortedArrayToBSTHelper(arr, mid + 1, end);

		root.left = leftST;
		root.right = rightST;

		return root;

	}
}
