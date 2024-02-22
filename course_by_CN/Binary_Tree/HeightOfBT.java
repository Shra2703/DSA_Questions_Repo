// Day 10 (22-02-2023)
// Height of the Binary tree

package course_by_CN.Binary_Tree;

public class HeightOfBT {
    public static int height(BinaryTreeNode root) {
		//Your code goes here
		if(root == null) return 0;
		int leftHeight = 1 + height(root.left);
		int rightHeight = 1 + height(root.right);

		return Math.max(leftHeight, rightHeight);
	}
}
