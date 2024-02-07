package course_by_CN.LinkedList;
// Day 3(07-02-2023)
// Taking input in the LL
import java.util.Scanner;

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
    }
}

public class LLInput {
    public static Node<Integer> createLL() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your element: ");
        int ele = s.nextInt();

        Node<Integer> head = null;
        Node<Integer> temp = null;
        while (ele != -1) {
            Node<Integer> createNode = new Node<>(ele);

            if(head == null){
                head = createNode;
                temp = head;
            }else{
                temp.next = createNode;
                temp = temp.next;
            }
            System.out.print("Enter your element: ");
            ele = s.nextInt();
        }

        return head;
    }

    public static void printLL(Node<Integer> head) {
        System.out.print("Printing the LL: ");
        Node<Integer> temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Node<Integer> head = createLL();
        printLL(head);

    }

    
}
