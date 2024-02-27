// Day 11 (27-02-2023)
// Is node present in the binary tree or not

package course_by_CN.Binary_Tree;

public class isNodePresent {
    public static boolean isNodePresent1(BinaryTreeNode root, int x) {
	    //Your code goes here
		if(root == null) return false;
		if(root.data == x) return true;

		return isNodePresent1(root.left, x) || isNodePresent1(root.right, x);
	}
}
