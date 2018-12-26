package Tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {


    public Node root;

    public BinaryTree() {
        root = null;
    }


    public List preOrder(){
        List results = new ArrayList<>();
        Node current = root;

        preOrderHelper(current, results);
        return results;

    }
//preOrder helper function the preOrder wraps it
    protected void preOrderHelper(Node root, List values){
        if(root != null) {

            values.add(root.data);
            preOrderHelper(root.left, values);
            preOrderHelper(root.right, values);
        }
    }

    public List inOrder(){
        List result = new ArrayList<>();
        Node current = root;

        inOrderHelper(current, result);
        return result;

    }
    //inOrder helper
    protected void inOrderHelper(Node root, List values){
        if (root != null) {
            inOrderHelper(root.left, values);
            values.add(root.data);
            inOrderHelper(root.right, values);
        }
    }

    public List postOrder(){
        List result = new ArrayList<>();
        Node current = root;

        postOrderHelper(current, result);

        return result;

    }
//postOrder Helper
    protected void postOrderHelper(Node root, List values){
        if(root != null) {
            postOrderHelper(root.left, values);
            postOrderHelper(root.right, values);
            values.add(root.data);
        }

    }

    public void printBreadthFirst()
    {
        int h = height(root);
        int i;
        for (i=1; i<=h; i++)
            printLevel(root, i);
    }

    public int height(Node root)
    {
        if (root == null)
            return 0;
        else
        {
            // compute  height
            int lheight = height(root.left);
            int rheight = height(root.right);

            //grab bigger one
            if (lheight > rheight)
                return(lheight+1);
            else return(rheight+1);
        }
    }

    // Print nodes at level
    public void printLevel (Node root ,int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1)
        {
            printLevel(root.left, level-1);
            printLevel(root.right, level-1);
        }
    }


}

