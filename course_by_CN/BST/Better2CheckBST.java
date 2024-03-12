// Day 5 (07-03-2024)
// Check if the given tree is BST or not,(BEtter)

import course_by_CN.Binary_Tree.BinaryTreeNode;

public class Better2CheckBST {
    public static boolean checkIfBST(BinaryTreeNode<Integer> root, int minRange, int maxRange) {
        if(root == null) return true;

        if(root.data > maxRange || root.data <= minRange) return false;

        return checkIfBST(root, minRange, root.data -1 ) && checkIfBST(root, root.data, maxRange);

    }
}
