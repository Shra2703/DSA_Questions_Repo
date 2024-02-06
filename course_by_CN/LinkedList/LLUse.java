package course_by_CN.LinkedList;
// Day 2(06-02-2023)
// Introduction of the linked list: creating the LL, printing the LL
// Increating the data of LL
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }

}

public class LLUse {

    // creating the linked list
    public static Node createLL() {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        return n1;
    }

    // printing the linked list
    public static void traversingLL(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Incrementing every element in the LL
    public static void increamentingLL(Node head){
        Node temp = head;
        while(temp != null){
            temp.data++;
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node(78);
        System.out.println(n1.data);
        System.out.println(n1.next);
        System.out.println(n1);

        Node head = createLL();
        System.out.println(head);
        traversingLL(head);
        increamentingLL(head);
        traversingLL(head);


    }
}
