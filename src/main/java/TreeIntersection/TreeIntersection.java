package TreeIntersection;

import Tree.Node;

import java.util.HashSet;
import java.util.Set;

public class TreeIntersection {
    //sources https://stackoverflow.com/questions/11271206/intersection-of-2-binary-trees-throws-stack-overflow-error
//comparables all messed up had to use Object

    public Set<Object> treeIntersection(Node root1, Node root2){

        Set<Object> result = new HashSet<>();
        treeIntersection(result, root1,root2);
        return result;
    }

    public void treeIntersection(Set<Object> result, Node root1, Node root2){
        if(root1 == null || root2 == null) {
            return;
        }
        if(root1.data == root2.data){
            result.add(root1.data);

            treeIntersection(result, root1.left, root2.left);
            treeIntersection(result, root1.right,root2.right);
        }else {result.add("No matchs");}

    }




}

