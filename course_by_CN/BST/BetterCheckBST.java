// Day 5 (07-03-2024)
// Check if the given tree is BST or not(BEtter)

class BSTinBT {
    boolean isBST;
    int min;
    int max;

    BSTinBT(boolean isBST, int min, int max) {
        this.isBST = isBST;
        this.min = min;
        this.max = max;
    }
}

public class BetterCheckBST {
    public static BSTinBT checkIfBST(BinaryTreeNode<Integer> root) {
        if (root == null)
            return (new BSTinBT(true, Integer.MAX_VALUE, Integer.MIN_VALUE));
        BSTinBT leftBST = checkIfBST(root.left);
        BSTinBT rightBST = checkIfBST(root.right);
        boolean isBST = true;

        if(leftBST.max >= root.data) isBST =false;
        if(rightBST.min < root.data) isBST =false;

        if(!leftBST.isBST) isBST = false;
        if(!rightBST.isBST) isBST = false;

        int min = Math.min(root.data, Math.min(leftBST.min, rightBST.min));
        int max = Math.max(root.data, Math.max(leftBST.max, rightBST.max));

        return new BSTinBT(isBST, min, max);

    }
}
