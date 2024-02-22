// Day 10 (22-02-2023)
// Counting no of node in binary tree

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

public class NoOfNode {
    public static int countNodes(BinaryTreeNode root) {
        // Write your code here.
        if (root == null)
            return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}
