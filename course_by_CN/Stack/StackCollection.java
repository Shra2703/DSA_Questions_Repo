package course_by_CN.Stack;
// Day 6(13-02-2023)
// Stack Collection

import java.util.Stack;

public class StackCollection {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int arr[] = {1,2,3,4,5,6};
        for(int ele : arr){
            stack.push(ele);
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
