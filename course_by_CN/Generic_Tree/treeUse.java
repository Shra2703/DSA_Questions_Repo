package course_by_CN.Generic_Tree;
// 04-04-2023
// Basic tree input, printing the tree

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class treeUse {
    public static TreeNodeClass<Integer> takeInput() {
        Scanner s = new Scanner(System.in);
        Queue<TreeNodeClass<Integer>> pendingNodes = new LinkedList<>();
        System.out.println("Enter the root node: ");
        int data = s.nextInt();
        if (data == -1)
            return null;
        TreeNodeClass<Integer> root = new TreeNodeClass<Integer>(data);
        pendingNodes.add(root);

        while (!pendingNodes.isEmpty()) {
            TreeNodeClass<Integer> front = pendingNodes.poll();
            System.out.print("No. of children you want of " + front.data + ":");
            int size = s.nextInt();
            for (int i = 0; i < size; i++) {
                System.out.println("Enter the " + i + "th child of" + front.data + ":");
                int num = s.nextInt();
                TreeNodeClass<Integer> child = new TreeNodeClass<Integer>(num);
                front.children.add(child);
                pendingNodes.add(child);

            }
        }

        return root;

    }

    public static int numberOfNodes(TreeNodeClass<Integer> root) {
        int count = 1;
        for (int i = 0; i < root.children.size(); i++) {
            TreeNodeClass<Integer> child = root.children.get(i);
            int countOfNodes = numberOfNodes(child);
            count += countOfNodes;

        }
        return count;
    }

    public static void printTree(TreeNodeClass<Integer> root) {
        System.out.print(root.data + " ");
        for (int i = 0; i < root.children.size(); i++) {
            TreeNodeClass<Integer> child = root.children.get(i);
            printTree(child);
        }
    }

    public static void printTreeBetter(TreeNodeClass<Integer> root) {
        if(root == null) return;
        System.out.print(root.data + ": ");

        for (int i = 0; i < root.children.size(); i++) {
            System.out.print(root.children.get(i).data + " ");
        }
        System.out.println();

        for (int i = 0; i < root.children.size(); i++) {
            TreeNodeClass<Integer> child = root.children.get(i);
            printTreeBetter(child);
        }
    }

    public static void main(String[] args) {
        TreeNodeClass<Integer> root = new TreeNodeClass<Integer>(1);
        TreeNodeClass<Integer> node1 = new TreeNodeClass<Integer>(2);
        TreeNodeClass<Integer> node2 = new TreeNodeClass<Integer>(3);
        TreeNodeClass<Integer> node3 = new TreeNodeClass<Integer>(4);
        TreeNodeClass<Integer> node4 = new TreeNodeClass<Integer>(5);
        TreeNodeClass<Integer> node5 = new TreeNodeClass<Integer>(6);

        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);

        node2.children.add(node4);
        node2.children.add(node5);

        root = takeInput();
        printTreeBetter(root);
        // System.out.println(numberOfNodes(root));
    }
}
