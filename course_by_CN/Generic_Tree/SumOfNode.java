package course_by_CN.Generic_Tree;


public class SumOfNode {
    public static int sumOfAllNode(TreeNode<Integer> root){

		int sumOfNode = root.data;
		for(int i = 0 ; i < root.children.size() ;i++){
			int sum = sumOfAllNode(root.children.get(i));
			sumOfNode += sum;
		}
		return sumOfNode;
	
	}
}
