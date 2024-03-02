// Day 11 (27-02-2023)
// Check whether tree is balanced

package course_by_CN.Binary_Tree;

public class WhetherTreeBalanced {
    public static int height(BinaryTreeNode root){
        if(root == null) return 0;
        int leftHeight = 1 + height(root.left);
        int rightHeight = 1 + height(root.right);

        return Math.max(leftHeight, rightHeight);

    }

    public static boolean treeBalanced(BinaryTreeNode root) {
        if(root == null) return true;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if(Math.abs(leftHeight - rightHeight) > 1) return false;

        boolean leftBalanced = treeBalanced(root.left);
        boolean rightBalanced = treeBalanced(root.right);

        return leftBalanced && rightBalanced;
        
    }
}
