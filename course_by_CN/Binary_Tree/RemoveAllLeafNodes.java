// Day 11 (27-02-2023)
// remove all leaf nodes in the binary tree

package course_by_CN.Binary_Tree;

public class RemoveAllLeafNodes {
    public static BinaryTreeNode removeLeafNode(BinaryTreeNode root) {
        if(root == null) return null;
        if(root.left == null && root.right == null) return null;

        BinaryTreeNode leftNode = removeLeafNode(root.left);
        BinaryTreeNode rightNode = removeLeafNode(root.right);

        root.left = leftNode;
        root.right = rightNode;

        return root;

        
    }
}
