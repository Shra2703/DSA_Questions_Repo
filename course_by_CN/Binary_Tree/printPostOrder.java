// Day 10 (22-02-2023)
// printing postorder traversal


package course_by_CN.Binary_Tree;

public class printPostOrder {
    public static void postOrder(BinaryTreeNode root) {
		//Your code goes here
		if(root == null) return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}
}
