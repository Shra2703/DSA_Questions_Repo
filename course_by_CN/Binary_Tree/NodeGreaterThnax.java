// Day 10 (22-02-2023)
// Node Greater than X

package course_by_CN.Binary_Tree;

public class NodeGreaterThnax {
    public static int countNodesGreaterThanX(BinaryTreeNode root, int x) {
		//Your code goes here
		if(root == null) return 0;
		int count = root.data > x ? 1 : 0;
		if(root.left != null)
		count += countNodesGreaterThanX(root.left, x);	
		if(root.right!= null)	
		 count +=  countNodesGreaterThanX(root.right, x);

		return count;

	}
}
