
class BinaryTreeNode{
    int data;
    BinaryTreeNode left;
    BinaryTreeNode right;

    BinaryTreeNode(int data){
        this.data = data;
    }
}

public class TakeInputLevelWise {

    public static void print(BinaryTreeNode root){
        if(root == null) return;
        System.out.print(root.data + ": ");
        if(root.left != null) System.out.print("L" + root.left.data + ", ");
        if(root.right != null) System.out.print("R" + root.right.data);
        System.out.println();

        print(root.left);
        print(root.right);
    }
    
}
