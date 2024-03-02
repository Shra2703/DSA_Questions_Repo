// Day 2 (02-03-2024)
// Insert duplicate node in the binary tree

package course_by_CN.Binary_Tree;

public class insertDuplicateNode {
    public static void insertDuplicateNode1(BinaryTreeNode root) {
		//Your code goes here

		if(root == null) return;
		insertDuplicateNode1(root.left);
		BinaryTreeNode leftDupt = new BinaryTreeNode(root.data);
		BinaryTreeNode temp = root.left;
		root.left = leftDupt;
		leftDupt.left = temp;

		insertDuplicateNode1(root.right);




	}
}
