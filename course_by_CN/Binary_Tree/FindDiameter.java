// Day 1 (01-03-2024)
// Finding the diameter

package course_by_CN.Binary_Tree;

class Diameter {
    int height;
    int maxDiamerter;

    Diameter(int height, int maxDiamerter) {
        this.height = height;
        this.maxDiamerter = maxDiamerter;
    }

}

public class FindDiameter {

    public static Diameter diameterOfBinaryTreeInner(BinaryTreeNode root) {
        // Your code goes here
        if (root == null) {
            Diameter ans = new Diameter(0, 0);
            return ans;
        }

        Diameter leftTree = diameterOfBinaryTreeInner(root.left);
        Diameter rightTree = diameterOfBinaryTreeInner(root.right);

        int dist = leftTree.height + rightTree.height + 1;

        int diameter = Math.max(leftTree.maxDiamerter, Math.max(rightTree.maxDiamerter, dist));
        int height = Math.max(leftTree.height, rightTree.height) + 1;

        return (new Diameter(height, diameter));

    }

    public static int diameterOfBinaryTree(BinaryTreeNode root) {
        // Your code goes here

        Diameter ans = diameterOfBinaryTreeInner(root);
        return ans.maxDiamerter;

    }

}
