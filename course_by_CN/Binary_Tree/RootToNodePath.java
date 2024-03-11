// Day 6 (11-03-2024)
// Root to node path in bt

package course_by_CN.Binary_Tree;

import java.util.ArrayList;

public class RootToNodePath {
    public static ArrayList<Integer> rootToNodePath(BinaryTreeNode root, int x) {
        if(root  == null) return null;

        if(root.data == x){
            ArrayList<Integer> output = new ArrayList<>();
            output.add(root.data);
            return output;
        }
        
        ArrayList<Integer> leftOutput = rootToNodePath(root.left, x);
        if(leftOutput != null){
            leftOutput.add(root.data);
            return leftOutput;
        }

        ArrayList<Integer> rightOutput = rootToNodePath(root.right, x);
        if(rightOutput != null){
            rightOutput.add(root.data);
            return rightOutput;
        }

        return null;
    }
}
