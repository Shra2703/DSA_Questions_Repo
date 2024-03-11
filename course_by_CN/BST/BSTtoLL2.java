// Day 6 (10-03-2024)
// VST to LL Better approach

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}



public class BSTtoLL2 {
    public static LinkedListNode<Integer> helper(BinaryTreeNode<Integer> currNode,
            LinkedListNode<Integer> currenLLNode) {
        if (currNode == null)
            return currenLLNode;
        if (currNode.left != null)
            currenLLNode = helper(currNode.left, currenLLNode);
        LinkedListNode<Integer> newNode = new LinkedListNode<>(currNode.data);
        currenLLNode.next = newNode;
        currenLLNode = newNode;
        // System.out.println(currenLLNode.data);
        if (currNode.right != null)
            currenLLNode = helper(currNode.right, currenLLNode);
        return currenLLNode;
    }

    public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
        if (root == null)
            return null;

        LinkedListNode<Integer> head = new LinkedListNode<>(root.data);
        // head =
        helper(root, head);
        return head.next;

    }
}
