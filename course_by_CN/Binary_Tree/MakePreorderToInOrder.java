// Day 4 (06-03-2024)
// Make tree from preorder and inorder

package course_by_CN.Binary_Tree;

public class MakePreorderToInOrder {
    public class Solution {

        public static int find(int[] in, int preS, int preE, int data) {
            for (int i = preS; i <= preE; i++) {
                if (in[i] == data)
                    return i;
            }
            return -1;
        }

        static int index = 0;

        public static BinaryTreeNode buildTreeHelper(int[] pre, int[] in, int preS, int preE) {

            if (preS > preE)
                return null;
            int currData = pre[index];
            index++;
            BinaryTreeNode root = new BinaryTreeNode(currData);
            if (preE == preS)
                return root;

            int posIn = find(in, preS, preE, currData);

            BinaryTreeNode leftST = buildTreeHelper(pre, in, preS, posIn - 1);
            BinaryTreeNode rightST = buildTreeHelper(pre, in, posIn + 1, preE);

            root.left = leftST;
            root.right = rightST;

            return root;

        }

        public static BinaryTreeNode buildTree(int[] preOrder, int[] inOrder) {
            // Your code goes here
            BinaryTreeNode root = buildTreeHelper(preOrder, inOrder, 0, preOrder.length - 1);
            return root;
        }

    }

}
