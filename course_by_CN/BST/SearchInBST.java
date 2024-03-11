// Day 4 (06-03-2024)
// Searching in BST



class BinaryTreeNode<T>{
    int data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    BinaryTreeNode(int data){
        this.data = data;
    }
}


public class SearchInBST {
    public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
		if(root == null) return false;
		if(root.data == k) return true;

		boolean ans = k < root.data ? searchInBST(root.left, k) : searchInBST(root.right, k);
		
		return ans;

		
	}
}
