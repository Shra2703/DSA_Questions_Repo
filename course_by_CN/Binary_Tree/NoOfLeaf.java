// Day 11 (27-02-2023)
// Print number of leaves in the binary tree

package course_by_CN.Binary_Tree;

public class NoOfLeaf {
    public static int  printNoOfLeafNode(BinaryTreeNode root){
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;

        return printNoOfLeafNode(root.left) + printNoOfLeafNode(root.right);
    }
}
