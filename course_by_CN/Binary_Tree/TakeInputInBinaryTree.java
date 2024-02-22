package course_by_CN.Binary_Tree;
// Day 10 (22-02-2023)
// Basic of Binary Tree
// Taking input in the binary tree

import java.util.Scanner;

// Binary Tree Node
class BinaryTreeNode {
    int data;
    BinaryTreeNode left;
    BinaryTreeNode right;

    BinaryTreeNode(int data) {
        this.data = data;
    }
}

public class TakeInputInBinaryTree {

    // taking the input recursively
    public static BinaryTreeNode takeInput() {
        System.out.println("Enter the roots data:");
        Scanner s = new Scanner(System.in);
        int ele = s.nextInt();

        if (ele == -1)
            return null;
        BinaryTreeNode root = new BinaryTreeNode(ele);
        BinaryTreeNode leftChild = takeInput();
        BinaryTreeNode rightChild = takeInput();

        root.left = leftChild;
        root.right = rightChild;
        return root;
    }

    public static BinaryTreeNode takeInputBetter(boolean isRoot, int parentData, boolean isLeft) {
        if (isRoot)
            System.out.println("Enter root data: ");
        else if (isLeft)
            System.out.println("Enter Left of " + parentData);
        else
            System.out.println("Enter Right of " + parentData);
        Scanner s = new Scanner(System.in);
        int ele = s.nextInt();
        if(ele == -1) return null;
        BinaryTreeNode root = new BinaryTreeNode(ele);
        BinaryTreeNode leftChild = takeInputBetter(false, ele, true);
        BinaryTreeNode rightChild = takeInputBetter(false, ele, false);

        root.left = leftChild;
        root.right = rightChild;
        return root;
    }

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
        // BinaryTreeNode root = takeInput();
        BinaryTreeNode root = takeInputBetter(true, 0, false);
        printBinaryTreeDetail(root);
    }
}
