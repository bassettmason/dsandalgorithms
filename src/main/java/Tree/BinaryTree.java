package Tree;

import java.util.ArrayList;

public class BinaryTree {


    public Node root;

    public void BinaryTree() {
        root = null;
    }
    ArrayList<Node> returnList = new ArrayList<>();

    public Node[] postorder(Node rootNode) {
        return returnList;


    }
    private static ArrayList<Node> postorderHelper(Node rootNode){


        if (rootNode == null) {
             return new ArrayList<Node>();
        }
        postorderHelper(rootNode.left);

        postorderHelper(rootNode.right);

        returnList.add(rootNode);


        ;
    }

   public void inorder(Node rootNode){

        if (rootNode == null) {
            return;
        }
        inorder(rootNode.left);

        returnList.add(rootNode);

        inorder(rootNode.right);
    }

    public void preorder(Node rootNode){

        if (rootNode == null) {
            return ;
        }
        returnList.add(rootNode.data);

        preorder(rootNode.left);

        preorder(rootNode.right);
    }


}

