// Day 11 (27-02-2023)
// Mirror image of the tree

package course_by_CN.Binary_Tree;

public class MirrorImageTree {
    public static BinaryTreeNode mirrorBinaryTreeUpdate(BinaryTreeNode root) {
        // Your code goes here
        if (root == null)
            return null;

        BinaryTreeNode leftNode = mirrorBinaryTreeUpdate(root.left);
        BinaryTreeNode rightNode = mirrorBinaryTreeUpdate(root.right);

        root.left = rightNode;
        root.right = leftNode;

        return root;

    }

    public static void mirrorBinaryTree(BinaryTreeNode root) {
		// Your code goes here

        // 1st way
		mirrorBinaryTreeUpdate(root);


        // 2nd way
        if(root.left == null  || root.right == null)
            return;
        BinaryTreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        mirrorBinaryTree(root.left);
        mirrorBinaryTree(root.right);

	}
}
