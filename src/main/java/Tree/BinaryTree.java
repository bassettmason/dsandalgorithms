package Tree;

import java.util.ArrayList;

public class BinaryTree {


    public Node root;

    public void BinaryTree() {
        root = null;
    }
    ArrayList<Integer> returnList = new ArrayList<>();

   public void postorder(Node rootNode){


        if (rootNode == null) {
            return;
        }
        postorder(rootNode.left);

        postorder(rootNode.right);


        returnList.add(rootNode.data);
    }

   public void inorder(Node rootNode){

        if (rootNode == null) {
            return;
        }
        inorder(rootNode.left);

        returnList.add(rootNode.data);

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

