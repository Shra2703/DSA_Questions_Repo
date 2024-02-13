package course_by_CN.Stack;
// Day 6(13-02-2023)
// Stack Data Structures using array
class StackClass {
    private int sizeEle = -1;
    private int arr[]; 

    StackClass() {
        arr = new int[2];
    }

    // to get the size of stack
    int size() {
        return sizeEle + 1;
    }

    // function to check whether stack is empty or not
    boolean isEmpty() {
        return sizeEle == -1;
    }

    // function to get the top element of the stack
    int top() throws underFlowStack {
        if (arr.length == 0)
            throw new underFlowStack();
        return arr[sizeEle];
    }

    // function to push the element in the stack
    void push(int ele) {
        if (arr.length == sizeEle + 1){
            System.out.println("hell");
            doubleCapacity();
            // throw new Overflowstack();

        }
        sizeEle++;
        arr[sizeEle] = ele;
    }

    private void doubleCapacity() {
        int temp[] = new int[arr.length* 2];
        for(int i = 0 ; i < arr.length ;i++){
            temp[i] = arr[i];
        }
        arr = temp;
    }

    // function to pop the element in the stack
    int pop() throws underFlowStack {
        if (arr.length == 0)
            throw new underFlowStack();
        int ele = arr[sizeEle];
        sizeEle--;
        return ele;

    }

}

public class StackUse {
    public static void main(String[] args) {
        StackClass s = new StackClass();
        try {
            // s.push(0);
            // s.push(1);
            // s.push(2);
            // System.out.println(s.top());
            // System.out.println(s.size());
            // System.out.println(s.pop());
            // System.out.println(s.pop());
            // System.out.println(s.isEmpty());

            for(int i = 0; i < 5 ; i++){
                s.push(i + 1);
            }

            while (!s.isEmpty()) {
                System.out.println(s.pop());
            }
        }catch(Exception e){
            System.out.println(e);
        }
        // } catch (Overflowstack e) {
        //     System.out.println("Stack is full!!!");

        // } 
        // catch (underFlowStack e) {
        //     System.out.println("Stack is Empty!!!");
        // }

    }
}
