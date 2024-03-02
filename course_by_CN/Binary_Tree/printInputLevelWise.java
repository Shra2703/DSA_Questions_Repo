// Day 2 (02-03-2024)
// print tree level wise

package course_by_CN.Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class printInputLevelWise {
    public static void printLevelWise(BinaryTreeNode root) {
		//Your code goes here
        if(root == null) return;

        Queue<BinaryTreeNode> pendingNode = new LinkedList<>();
        pendingNode.add(root);
        while(!pendingNode.isEmpty()){
            BinaryTreeNode front = pendingNode.poll();
            System.out.print(front.data + ":");
            if(front.left != null){
                System.out.print("L:" + front.left.data + ",");
                pendingNode.add(front.left);
            }else System.out.print("L:" + -1 + ",");

            if(front.right != null){
                System.out.print("R:" + front.right.data);
                pendingNode.add(front.right);
            }else System.out.print("R:" + -1);
            System.out.println();
        }
	}
}
