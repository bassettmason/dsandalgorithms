package Tree;

public class BinarySearchTree {

    public Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void add(int value) {
        Node newNode = new Node(value);
        root = recursiveAdd(root, newNode);
    }

    private Node recursiveAdd(Node curr, Node value) {
        if (curr == null) {
            return new Node(value.data);
        }

        if (value.compareTo(curr) < 0) {
            curr.left = recursiveAdd(curr.left, value);
        } else if (value.compareTo(curr) > 0) {
            curr.right = recursiveAdd(curr.right, value);
        } else {
            return curr;
        }
        return curr;
    }

    public boolean contains( int value){
        Node newNode = new Node(value);
        return containsHelper(root, newNode);
    }

    public boolean containsHelper(Node curr, Node target){
        if (curr == null){
            return false;
        }
        if (target.data == curr.data){
            return true;
        }
        return target.compareTo(curr) < 0 ? containsHelper(curr.left, target) : containsHelper(curr.right, target);
    }



}



