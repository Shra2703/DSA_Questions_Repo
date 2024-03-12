// Day 6 (11-03-2024)
// Get LCA

import course_by_CN.Binary_Tree.BinaryTreeNode;

public class getLCA {
    public static int getLCA1(BinaryTreeNode<Integer> root, int a, int b) {
		if(root == null) return -1;

		if(root.data > a && root.data > b) return getLCA1(root.left, a, b);		
		if(root.data < a && root.data < b) return getLCA1(root.left, a, b);

		return root.data;
		
	}
}
