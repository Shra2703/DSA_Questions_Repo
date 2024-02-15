package course_by_CN.Queue;
// Day 8(15-02-2023)
// Queue implementation using ll

class QueueIsEmpty extends Exception {

}

class Node1 {
    int data;
    Node1 next;

    Node1(int ele) {
        this.data = ele;
    }

}

class QueueUsingLL {
    private Node1 front = null;
    private Node1 rear = null;
    private int size = 0;

    // getting the size of the queue
    int getSize() {
        return size;
    }

    // checking whether the queue is empty or not
    boolean isEmpty() {
        return size == 0;
    }

    // adding the element in the queue at the rear end
    void enqueue(int ele) {

        Node1 newNode = new Node1(ele);
        if (size == 0) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = rear.next;
        }

        size++;

    }

    // deleting the element in the queue at the front end
    int dequeue() throws QueueIsEmpty {
        if (size == 0) {
            throw new QueueIsEmpty();
        }
        int ele = front.data;
        if (front == rear) {
            front = null;
            rear = null;
        } else {
            front = front.next;
        }

        size--;
        return ele;

    }

    // getting the front element in the queue

    int getFront() throws QueueIsEmpty {
        if (size == 0)
            throw new QueueIsEmpty();
        return front.data;
    }

}

public class QueueLL {
    public static void main(String[] args) throws QueueIsEmpty {

        QueueUsingLL queue = new QueueUsingLL();
        queue.enqueue(0);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.getSize());
        System.out.println(queue.isEmpty());
        queue.dequeue();
        System.out.println(queue.getSize());
        System.out.println(queue.getFront());

    }
}
