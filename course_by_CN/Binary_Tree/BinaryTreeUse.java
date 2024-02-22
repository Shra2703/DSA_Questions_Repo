package course_by_CN.Binary_Tree;
// Day 10 (22-02-2023)
// Basic of Binary Tree
// Printing the binary tree Recursvely

// Binary Tree Node
class BinaryTreeNode {
    int data;
    BinaryTreeNode left;
    BinaryTreeNode right;

    BinaryTreeNode(int data) {
        this.data = data;
    }
}

public class BinaryTreeUse {

    // Printing the binary tree
    public static void printBinaryTree(BinaryTreeNode root) {
        if (root == null)
            return;
        System.out.println(root.data);
        printBinaryTree(root.left);
        printBinaryTree(root.right);

    }


    // Printitng the binary tree in detailed manner
    public static void printBinaryTreeDetail(BinaryTreeNode root) {
        if (root == null)
            return;
        System.out.print(root.data + ": ");
        if (root.left != null)
            System.out.print("L" + root.left.data + ", ");
        if (root.right != null)
            System.out.print("R" + root.right.data);
        System.out.println();
        printBinaryTreeDetail(root.left);
        printBinaryTreeDetail(root.right);

    }

    public static void main(String[] args) {
        // making nodes of binary and connecting it
        BinaryTreeNode root1 = new BinaryTreeNode(1);
        BinaryTreeNode rootLeft = new BinaryTreeNode(2);
        BinaryTreeNode rootRight = new BinaryTreeNode(3);

        BinaryTreeNode twoLeft = new BinaryTreeNode(4);
        BinaryTreeNode twoRight = new BinaryTreeNode(5);

        
        BinaryTreeNode threeRight = new BinaryTreeNode(6);

        root1.left = rootLeft;
        root1.right = rootRight;
        rootLeft.left = twoLeft;
        rootLeft.right = twoRight;

        rootRight.right = threeRight;
        printBinaryTreeDetail(root1);
    }
}
