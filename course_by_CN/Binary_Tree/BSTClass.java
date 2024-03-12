package course_by_CN.Binary_Tree;
// Day 7 (12-03-2024)
// Bst class where insert, delete, search, print it

import BinaryTreeNode;

class BinaryTreeNode<T> {
    int data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    BinaryTreeNode(int data) {
        this.data = data;
    }
}

public class BSTClass {

    private BinaryTreeNode<Integer> root = null;

    private static BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> node, int data) {
        if (node == null)
            return new BinaryTreeNode<Integer>(data);
        if (data > node.data)
            node.right = insertHelper(node.right, data);
        else
            node.left = insertHelper(node.left, data);
        return node;
    }

    public void insert(int data) {
        // Implement the insert() function

        root = insertHelper(root, data);
    }

    private static int minimum(BinaryTreeNode<Integer> root) {
        if (root == null)
            return 100000;

        int leftData = minimum(root.left);
        int rightData = minimum(root.right);

        return Math.min(root.data, Math.min(leftData, rightData));

    }

    private static BinaryTreeNode<Integer> removeHelper(BinaryTreeNode<Integer> root, int data) {
        if (root == null)
            return null;

        if (root.data == data) {
            if (root.left == null && root.right == null)
                return null;
            else if (root.left != null && root.right == null)
                return root.left;
            else if (root.right != null && root.left == null)
                return root.right;
            else {
                data = minimum(root.right);
                root.data = data;
                root.right = removeHelper(root.right, data);
                return root;
            }
        }

        if (data <= root.data)
            root.left = removeHelper(root.left, data);
        else
            root.right = removeHelper(root.right, data);

        return root;
    }

    public void remove(int data) {
        // Implement the remove() function
        root = removeHelper(root, data);
    }

    public void printTreeHelper(BinaryTreeNode<Integer> root) {
        // Implement the printTree() function
        if (root == null)
            return;

        System.out.print(root.data + ":");
        if (root.left != null)
            System.out.print("L:" + root.left.data + ",");
        if (root.right != null)
            System.out.print("R:" + root.right.data);

        System.out.println();
        printTreeHelper(root.left);
        printTreeHelper(root.right);

    }

    public void printTree() {
        // Implement the printTree() function
        if (root == null)
            return;
        printTreeHelper(root);
    }

    public boolean searchHelper(BinaryTreeNode<Integer> node, int data) {
        if (node == null)
            return false;
        if (node.data == data)
            return true;

        if (node.data > data)
            return searchHelper(node.left, data);
        else
            return searchHelper(node.right, data);

        // return false;

    }

    public boolean search(int data) {
        // Implement the search() function
        return searchHelper(root, data);
    }

}
