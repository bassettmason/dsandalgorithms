package challenges;

import Tree.Node;

public class IsSameTree {

    public boolean isSameTree(Node p, Node q) {

        if (p == null){
            return (q == null);
        }
        if (q == null){
            return (p == null);
        }
        if (p.data != q.data){
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
