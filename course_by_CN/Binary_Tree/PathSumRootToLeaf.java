// Day 3 (03-03-2024)
// Path sum root to leaf

package course_by_CN.Binary_Tree;

import java.util.ArrayList;

public class PathSumRootToLeaf {
    public static void rootToLeafPaths(BinaryTreeNode root, int k, ArrayList<Integer> path) {
		//Your code goes here
		if(root == null) return;
		path.add(root.data);
		if(root.left == null && root.right == null && (k - root.data) == 0){
			for(int i : path) System.out.print(i + " ");
			System.out.println();
		}

		rootToLeafPaths(root.left, k-root.data, path);		
		rootToLeafPaths(root.right, k-root.data, path);

       path.remove(path.size() - 1);


	}

	public static void rootToLeafPathsSumToK(BinaryTreeNode root, int k) {
		//Your code goes here
		rootToLeafPaths(root, k, new ArrayList<>());
	}
}
