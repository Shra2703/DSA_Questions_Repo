package course_by_CN.Generic_Tree;

public class numOfNodeGreaterThanX {
    if(root == null ) return 0;

		int count = root.data > x ? 1 : 0;
		for(int i = 0 ; i < root.children.size() ;i++){
			int countOfNode = numNodeGreater(root.children.get(i), x);
			count += countOfNode;
		}

		return count;
}
