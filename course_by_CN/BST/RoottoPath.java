// Day 6 (11-03-2024)
// Root to node path in bt

import java.util.ArrayList;

import course_by_CN.Binary_Tree.BinaryTreeNode;

public class RoottoPath {
    public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
        if(root == null) return null;
        if(root.data == data){
            ArrayList<Integer> output = new ArrayList<>();
            output.add(root.data);
            return output;
        }

        if(root.data > data){
            ArrayList<Integer> leftOutput = getPath(root.left, data);
            if(leftOutput != null){
                leftOutput.add(root.data);
                return leftOutput;
            }
        }else{
            ArrayList<Integer> rightOutput = getPath(root.right, data);
            if(rightOutput != null){
                rightOutput.add(root.data);
                return rightOutput;
            }
        }
        return null;
	}
}

