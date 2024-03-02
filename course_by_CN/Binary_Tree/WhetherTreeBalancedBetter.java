// Day 1 (01-03-2024)
// Check whether tree is balanced better

package course_by_CN.Binary_Tree;

class BinaryTreeBetter {
    int height;
    boolean isBal;

    BinaryTreeBetter(int height, boolean isBal){
        this.height = height;
        this.isBal = isBal;
    }
}

public class WhetherTreeBalancedBetter {

    public static BinaryTreeBetter whetherTreeBalanceBetter(BinaryTreeNode root) {
        if(root == null){
            BinaryTreeBetter ans = new BinaryTreeBetter(0, true);
            return ans;
        }

        BinaryTreeBetter leftTree = whetherTreeBalanceBetter(root.left);
        BinaryTreeBetter rightTree = whetherTreeBalanceBetter(root.right);

        boolean isBal = true;
        int height = 1 + Math.max(leftTree.height, rightTree.height);

        if(Math.abs(leftTree.height - rightTree.height) > 1) isBal = false;

        if(!leftTree.isBal || !rightTree.isBal) isBal = false;

        BinaryTreeBetter ans = new BinaryTreeBetter(height, isBal);
        return ans;
        
    }
    
}
