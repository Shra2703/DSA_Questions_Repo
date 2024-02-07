// Day 3(07-02-2023)
// Checking whether the ll is palindeome or not

package course_by_CN.LinkedList;

public class PalindromeLL {
    public class Solution {

        public static Node<Integer> reverseLL(Node<Integer> root) {
            Node<Integer> temp = null, prev = root, curr = root;

            while (curr != null) {
                curr = curr.next;
                prev.next = temp;
                temp = prev;
                prev = curr;
            }

            root = temp;
            return root;

        }

        public static boolean isPalindrome(Node<Integer> head) {
            // Your code goes here
            if (head == null || head.next == null)
                return true;
            Node<Integer> slow = head, fast = head.next;

            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            Node<Integer> head2 = reverseLL(slow.next);
            slow.next = null;
            Node<Integer> temp1 = head, temp2 = head2;
            while (temp1 != null && temp2 != null) {
                if (temp1.data != temp2.data) {
                    // System.out.println("hello");
                    return false;

                }
                // System.out.println(temp1.data + " " + temp2.data);
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            return true;

        }

    }

}
