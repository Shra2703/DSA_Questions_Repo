// Day 10 (22-02-2023)
// printing preorder traversal

package course_by_CN.Binary_Tree;

public class printPreOrder {
    public static void preOrder(BinaryTreeNode root) {
		//Your code goes here
		if(root == null) return;
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}
}
