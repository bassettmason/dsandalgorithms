package FizzBuzzTree;
import Tree.BinaryTree;
import Tree.Node;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FizzBuzzTreeTest {

    @Test
    public void fizzBuzzTreeTest() {

        BinaryTree binaryTreeTest = new BinaryTree();
        ArrayList<String> expected = new ArrayList<>();

        binaryTreeTest.root = new Node(3);
        binaryTreeTest.root.left = new Node(4);
        binaryTreeTest.root.left.left = new Node(6);
        binaryTreeTest.root.left.right = new Node(10);
        binaryTreeTest.root.right = new Node(8);
        binaryTreeTest.root.right.left = new Node(7);
        binaryTreeTest.root.right.right = new Node(15);

        expected.add("Fizz");
        expected.add("4");
        expected.add("Buzz");
        expected.add("6");
        expected.add("7");
        expected.add("8");
        expected.add("FizzBuzz");

        Object newList = fizz(binaryTreeTest).preOrder();


        assertEquals(expected, newList);


    }


}