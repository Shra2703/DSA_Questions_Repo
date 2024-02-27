// Day 11 (27-02-2023)
// print the nodes at the depth k

package course_by_CN.Binary_Tree;

public class printAtDepthK {
    public static void printAtDepth(BinaryTreeNode root, int k) {
        if(root == null) return;
        if(k == 0){
            System.out.println(root.data);
            return;
        }

        printAtDepth(root.left, k-1);
        printAtDepth(root.right, k-1);
    }
}
