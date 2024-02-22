// Day 10 (22-02-2023)
// finding the largest data

package course_by_CN.Binary_Tree;
public class LargestData {
    public static int largest(BinaryTreeNode root) {
        if (root == null)
            return -1;

        int leftData = largest(root.left);
        int rightData = largest(root.right);

        return Math.max(root.data, Math.max(leftData, rightData));
    }
}