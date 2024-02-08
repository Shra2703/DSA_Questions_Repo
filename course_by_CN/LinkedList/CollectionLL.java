// Day 4(08-02-2023)
// collection framework of ll

package course_by_CN.LinkedList;

import java.util.LinkedList;

public class CollectionLL {
    public static void main(String[] args) {
        // doubly linked list 
        LinkedList<Integer> head = new LinkedList<>();
        head.add(10);
        head.add(20);
        head.add(30);
        head.add(40);
        head.addFirst(0);
        head.add(4, 100);

        System.out.println(head.size());
        System.out.println(head.get(3));

        for(int i = 0 ; i < head.size() ; i++){
            System.out.print(head.get(i) + " ");
        }
    }
}
