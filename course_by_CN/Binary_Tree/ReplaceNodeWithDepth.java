// Day 11 (27-02-2023)
// Replace the node with depth

package course_by_CN.Binary_Tree;

public class ReplaceNodeWithDepth {
    public static void changeToDepthTreeUpdates(BinaryTreeNode root, int k) {
	    //Your code goes here
		if(root == null) return;
		root.data = k;
		changeToDepthTreeUpdates(root.left , k+1);		
		changeToDepthTreeUpdates(root.right , k+1);

	}

	public static void changeToDepthTree(BinaryTreeNode root) {
	    //Your code goes here
		changeToDepthTreeUpdates(root, 0);
	}
}
