// Day 5 (07-03-2024)
// Check if the given tree is BST or not

import course_by_CN.Binary_Tree.BinaryTreeNode;

public class CheckBST {
    public static boolean checkIfBST(BinaryTreeNode<Integer> root) {
        if(root == null) return true;

        int leftMax = maximum(root);
        if(leftMax > root.data) return false;

        int rightMax = minimum(root);
        if(rightMax > root.data) return false;

        boolean isBSTLeft = checkIfBST(root.left);
        boolean isBSTRight = checkIfBST(root.right);

        return isBSTLeft && isBSTRight;



        
    }

    private static int maximum(BinaryTreeNode<Integer> root) {
        if(root == null) return Integer.MIN_VALUE;

        int leftMax = minimum(root.left);
        int rightMax = minimum(root.right);

        return Math.max(root.data,(Math.max(leftMax, rightMax)));
    }

    private static int minimum(BinaryTreeNode<Integer> root) {
        if(root == null) return Integer.MAX_VALUE;

        int leftMin = minimum(root.left);
        int rightMin = minimum(root.right);

        return Math.min(root.data,(Math.min(leftMin, rightMin)));
    }
}
