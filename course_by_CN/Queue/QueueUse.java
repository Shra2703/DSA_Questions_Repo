package course_by_CN.Queue;
// Day 8(15-02-2023)
// Queue implementation using array

class QueueArray {
    private int front;
    private int rear;
    private int arr[];
    private int size = 0;

    QueueArray() {
        front = -1;
        rear = -1;
        arr = new int[5];
    }

    QueueArray(int capacity) {
        front = -1;
        rear = -1;
        arr = new int[capacity];
    }

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
        if (front == (rear + 1) % arr.length) {
            // throw new OverFlowInQueue();
            doubleCapacity();
        }
        if (front == -1 && rear == -1) {
            front = 0;
            rear = 0;
        } else
            rear = (rear + 1) % arr.length;
        arr[rear] = ele;
        size++;

    }

    // doubling the capacity
    private void doubleCapacity() {
        int temp[] = new int[arr.length * 2];
        int tempF = front;
        for(int i = 0; i < arr.length ; i++){
            temp[i] = arr[front];
            tempF = (tempF + 1) % arr.length;
        }
        arr = temp;
    }

    // deleting the element in the queue at the front end
    int dequeue() throws UnderFlowInQueue {
        if (size == 0) {
            throw new UnderFlowInQueue();
        }
        int ele = arr[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % arr.length;
        }

        size--;
        return ele;

    }

    // getting the front element in the queue

    int getFront() throws UnderFlowInQueue {
        if (size == 0)
            throw new UnderFlowInQueue();
        return arr[front];
    }

}

public class QueueUse {
    public static void main(String[] args) throws OverFlowInQueue, UnderFlowInQueue {
        QueueArray queue = new QueueArray();

        queue.enqueue(0);
        queue.enqueue(1);
        queue.enqueue(2);
        System.out.println(queue.getSize());
        System.out.println(queue.isEmpty());
        queue.dequeue();
        System.out.println(queue.getSize());
        System.out.println(queue.getFront());

    }
}
