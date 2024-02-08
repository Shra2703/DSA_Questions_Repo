// Day 4(08-02-2023)
// printinf LL in reverse order

package course_by_CN.LinkedList.Recursion;

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
    }
}

public class PrintingLLRecursive {
    public static void printRecursive(Node<Integer> head){
        if(head == null) return;
        System.out.print(head.data + " ");
        printRecursive(head.next);
    }
}
