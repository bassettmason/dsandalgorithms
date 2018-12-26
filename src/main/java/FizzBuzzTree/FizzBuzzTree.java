//package FizzBuzzTree;
//import Tree.BinaryTree;
//import Tree.Node;
//
//public class FizzBuzzTree {
//
//    public BinaryTree fizzBuzzTree(BinaryTree tree){
//
//        fizzBuzzTreeHelper(tree.root);
//        return tree;
//    }
//
//    private void fizzBuzzTreeHelper(Node root){
//        if(root == null) {
//            return;
//        }
//        if((Integer) root.data % 15 == 0) {
//            root.data = "FizzBuzz";
//        }
//        else if((Integer)root.data % 3 == 0) {
//            root.data = "Fizz";
//        }
//        else if((Integer)root.data % 5 == 0) {
//            root.data = "Buzz";
//        }
//
//
//        fizzBuzzTreeHelper(root.left);
//        fizzBuzzTreeHelper(root.right);
//    }
//
//}