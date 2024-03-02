// Day 2 (02-03-2024)
// Finding min and max in the tree


package course_by_CN.Binary_Tree;

class Pair<T, U> {
    T minimum;
    U maximum;

    public Pair(T minimum, U maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

}
public class FindingMinAndMax {
    public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode root) {
		//Your code goes here
		if(root == null){
			Pair<Integer, Integer> ans = new Pair<>(100000,-1);
			return ans;
		}
		 Pair<Integer, Integer> leftPir = getMinAndMax(root.left);		 
		 Pair<Integer, Integer> rightPir = getMinAndMax(root.right);

		int min = Math.min(root.data, Math.min(leftPir.minimum, rightPir.minimum));		
		int max = Math.max(root.data, Math.max(leftPir.maximum, rightPir.maximum));

		Pair<Integer, Integer> ans = new Pair<>(min, max);
		return ans;
	}
}
