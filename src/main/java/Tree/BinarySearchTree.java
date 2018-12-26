package Tree;

public class BinarySearchTree {

    public Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void add(int value) {
        Node newNode = new Node(value);
        root = addHelper( newNode, root );
    }

    protected Node addHelper( Node newNode, Node curr ) {
        if(curr == null) {
            return new Node(newNode);
        }
        int compareResult = newNode.data.compareTo(curr.data);

        if(compareResult < 0) {
            curr.left = addHelper(newNode, curr.left);
        } else if( compareResult > 0 ) {
            curr.right = addHelper(newNode, curr.right);
        }else
            ;
            // Duplicate; do nothing
            return curr;

    }

    public Boolean contains(int value){
        Node searchNode = new Node (value);
        return containsHelper(this.root, searchNode);

    }

    protected Boolean containsHelper(Node curr, Node searchNode) {
        if (curr == null) {
            return false;
        }

        int compareResult = curr.data.compareTo(searchNode.data);

        if (compareResult < 0) {
            return containsHelper(curr.left, searchNode);
        } else if (compareResult > 0) {
            return containsHelper(curr.right, searchNode);
        } else {
            return true;
        }


    }

}
