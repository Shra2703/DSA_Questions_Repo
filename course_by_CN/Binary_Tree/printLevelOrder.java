// Day 3 (03-03-2024)
// print level order traversal

package course_by_CN.Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class printLevelOrder {
    public static void printLevelWise(BinaryTreeNode root) {
        // Your code goes here
        if (root == null)
            return;
        Queue<BinaryTreeNode> pendingNodes = new LinkedList<>();
        pendingNodes.add(root);
        pendingNodes.add(null);
        while (!pendingNodes.isEmpty()) {
            BinaryTreeNode front = pendingNodes.poll();
            if (front == null) {
                System.out.println();
                if (!pendingNodes.isEmpty())
                    pendingNodes.add(null);
                continue;
            }
            System.out.print(front.data + " ");
            if (front.left != null) {
                pendingNodes.add(front.left);
            }

            if (front.right != null) {
                pendingNodes.add(front.right);
            }

        }
    }
}
