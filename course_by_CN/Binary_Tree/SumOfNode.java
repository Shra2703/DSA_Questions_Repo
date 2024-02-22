// Day 10 (22-02-2023)
// Sum of nodes in binary tree

package course_by_CN.Binary_Tree;

// Binary Tree Node
class BinaryTreeNode {
    int data;
    BinaryTreeNode left;
    BinaryTreeNode right;

    BinaryTreeNode(int data) {
        this.data = data;
    }
}

public class SumOfNode {
    public static int getSum(BinaryTreeNode root) {
		//Your code goes here.
		if(root == null) return 0;
		return root.data + getSum(root.left) + getSum(root.right);
	}
}
