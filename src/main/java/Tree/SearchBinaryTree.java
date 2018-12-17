package Tree;

public class SearchBinaryTree {

    public Node root;

    public void BinaryTree() {
        root = null;
    }
    Node currNode = this.root;

    public void add(int value) {
        root = add(root, new Node(value));
    }
    private Node search(int value){
        if (this.root == null){
            return null;
        }
        while(value != currNode.data) {
            search(currNode.left);

            search(currNode.right);
        }
    return null;

    }

    public void add(int value) {
        root = add(root, new Node(value));
    }
    private Node add(Node currNode, Node newNode) {

        if (currNode == null) {
            return newNode;
        } else if (newNode.data > currNode.data) {
            currNode.right = add(currNode.right, newNode);
        } else if (newNode.data < currNode.data) {
            currNode.left = add(currNode.left, newNode);
        }

        return currNode;
    }
}
