package course_by_CN.Generic_Tree;

public class CountLeafNode {
    int leaf = root.children.size() == 0 ? 1 : 0;
		for(int i = 0 ; i <root.children.size() ;i++ ){
			int numOfLeaf = countLeafNodes(root.children.get(i));
			leaf += numOfLeaf;
		}

		return leaf;
}
