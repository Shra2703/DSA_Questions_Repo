// Day 3(07-02-2023)
// print the reverse of LL

package course_by_CN.LinkedList;

public class printReverseLL {
    public static void printReverse(Node<Integer> root) {
		if(root == null) return;
		printReverse(root.next);
		System.out.print(root.data + " ");
		
	}
}
