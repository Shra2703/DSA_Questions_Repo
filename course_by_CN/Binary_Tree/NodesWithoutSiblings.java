// Day 11 (27-02-2023)
// print node witout the siblings

package course_by_CN.Binary_Tree;

public class NodesWithoutSiblings {
    public static void printNodesWithoutSibling(BinaryTreeNode root) {
		//Your code goes here
		if(root == null) return;
		if(root.left != null && root.right == null) System.out.print(root.left.data + " ");		
		if(root.right != null && root.left == null) System.out.print(root.right.data + " ");

		printNodesWithoutSibling(root.left);
		printNodesWithoutSibling(root.right);


	}
}
