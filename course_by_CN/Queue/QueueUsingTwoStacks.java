// Day 9(16-02-2023)
// Queue using 2 stacks

package course_by_CN.Queue;
import java.util.* ;
import java.io.*; 

public class QueueUsingTwoStacks {

	// Stacks to be used in the operations.
	Stack<Integer> stk1, stk2;

	public QueueUsingTwoStacks() {
		// Intialise here.
		stk1 = new Stack<>();		
		stk2 = new Stack<>();

	}

	// Enqueues 'X' into the queue. Returns true after enqueuing.
	public boolean enqueue(int x) {
		// Write your code here.
		stk1.push(x);
		return true;
	}
	/*
	   Dequeues top element from queue. Returns -1 if the queue is empty, 
	   otherwise returns the popped element.
	*/
	public int dequeue() {
		// Write your code here.
		if(stk1.size() == 0 && stk2.size() == 0) return -1;
		int size = stk1.size();
		if(stk2.isEmpty()){
			while(size > 1){
				stk2.push(stk1.pop());
				size--;
			}
			int temp = stk1.pop();
			return temp;

		}
		return stk2.pop();
	}
};

