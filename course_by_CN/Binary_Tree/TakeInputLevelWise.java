package course_by_CN.Binary_Tree;
// Day 2 (02-03-2024)
// Taking input level wise

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


class BinaryTreeNode{
    int data;
    BinaryTreeNode left;
    BinaryTreeNode right;

    BinaryTreeNode(int data){
        this.data = data;
    }
}

public class TakeInputLevelWise {

    public static void print(BinaryTreeNode root){
        if(root == null) return;
        System.out.print(root.data + ": ");
        if(root.left != null) System.out.print("L" + root.left.data + ", ");
        if(root.right != null) System.out.print("R" + root.right.data);
        System.out.println();

        print(root.left);
        print(root.right);
    }

    public static BinaryTreeNode takeLevelWiseInput(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enters root data: ");
        int data = s.nextInt();
        if(data == -1) return null;

        BinaryTreeNode root = new BinaryTreeNode(data);
        Queue<BinaryTreeNode> pendingNodes = new LinkedList<>();
        pendingNodes.add(root);

        while (!pendingNodes.isEmpty()) {
            BinaryTreeNode front = pendingNodes.poll();
            System.out.print("Enter the left child of " + front.data + " :");
            int left = s.nextInt();
            if(left != -1){
                BinaryTreeNode leftChild = new BinaryTreeNode(left);
                front.left = leftChild;
                pendingNodes.add(leftChild);
            }

            System.out.print("Enter the right child of " + front.data + " :");
            int right = s.nextInt();
            if(right != -1){
                BinaryTreeNode rightChild = new BinaryTreeNode(right);
                front.right = rightChild;
                pendingNodes.add(rightChild);
            }
            
        }

        return root;


    }

    public static void main(String[] args) {
        BinaryTreeNode root = takeLevelWiseInput();
        print(root);
    }
    
}
