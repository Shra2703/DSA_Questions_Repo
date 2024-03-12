package course_by_CN.Binary_Tree;
// Day 7 (12-03-2024)
// Bst use class 

public class BSTUse {
    public static void main(String[] args) {
        BSTClass obj = new BSTClass();

        obj.insert(10);
        obj.insert(2);
        obj.insert(3);
        obj.insert(4);
        obj.insert(1);
        obj.insert(9);
        obj.insert(19);
        // obj.printTree();
        // obj.remove(10);
        obj.printTree();
        System.out.println(obj.search(3));
        System.out.println(obj.search(30));

    }
}
