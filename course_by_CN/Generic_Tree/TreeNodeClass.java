package course_by_CN.Generic_Tree;
import java.util.ArrayList;

public class TreeNodeClass<T> {
    T  data;
    ArrayList<TreeNodeClass<T>> children;

    TreeNodeClass( T data){
        this.data = data;
        this.children = new ArrayList<>();
    }
}
