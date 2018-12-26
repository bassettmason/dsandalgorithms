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
//    private void fizzBuzzTreeHelper(Node curr){
//        if(curr == null) {
//            return;
//
//        }
//        if((Integer)curr.data % 15 == 0) {
//            curr.data = "FizzBuzz";
//        }
//        else if((Integer)curr.data % 3 == 0) {
//            curr.data = "Fizz";
//        }
//        else if((Integer)curr.data % 5 == 0) {
//            curr.data = "Buzz";
//        }
//
//
//        fizzBuzzTreeHelper(curr.left);
//        fizzBuzzTreeHelper(curr.right);
//    }
//
//}