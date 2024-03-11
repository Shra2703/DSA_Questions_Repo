// Day 6 (11-03-2024)
// replaceWithLargerNodesSum

public class SumOfBST {
    public static int helper(BinaryTreeNode<Integer> root, int sum) {
        // Write your code here
        if (root == null)
            return sum;
        sum = helper(root.right, sum);
        sum += root.data;
        root.data = sum;
        sum = helper(root.left, sum);
        return sum;

    }

    static int sum = 0;

    public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
        // Write your code here

        helper(root, 0);

    }
}
