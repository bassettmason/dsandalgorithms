package Tree;

import org.junit.Test;

import java.util.ArrayList;

import static javafx.scene.input.KeyCode.T;
import static org.junit.Assert.*;

public class BinaryTreeTest {
    @Test
    public void createNodeTest() {

        BinaryTree testBinaryTree = new BinaryTree();
        ArrayList<Integer> expected = new ArrayList<>();

        testBinaryTree.root = new Node(1);
        testBinaryTree.root.left = new Node("hey");
        testBinaryTree.root.right = new Node(3);

        assertEquals(1,testBinaryTree.root.data);
        assertEquals("hey",testBinaryTree.root.left.data);
        assertEquals(3,testBinaryTree.root.right.data);

        Node j = new Node(3);
        Node h = new Node (3);
        assertEquals(0, j.compareTo(h));
    }

    @Test
    public void preOrderTest() {
        BinaryTree intTestBinaryTree = new BinaryTree();
        ArrayList<Integer> intExpected = new ArrayList<>();

        intTestBinaryTree.root = new Node(1);
        intTestBinaryTree.root.left = new Node(2);
        intTestBinaryTree.root.left.left = new Node(3);
        intTestBinaryTree.root.left.right = new Node(4);
        intTestBinaryTree.root.right = new Node(5);
        intTestBinaryTree.root.right.left = new Node(6);

        intExpected.add(1);
        intExpected.add(2);
        intExpected.add(3);
        intExpected.add(4);
        intExpected.add(5);
        intExpected.add(6);

        BinaryTree stringTestBinaryTree = new BinaryTree();
        ArrayList<String> stringExpected = new ArrayList<>();

        stringTestBinaryTree.root = new Node("a");
        stringTestBinaryTree.root.left = new Node("b");
        stringTestBinaryTree.root.left.left = new Node("c");
        stringTestBinaryTree.root.left.right = new Node("d");
        stringTestBinaryTree.root.right = new Node("e");
        stringTestBinaryTree.root.right.left = new Node("f");

        stringExpected.add("a");
        stringExpected.add("b");
        stringExpected.add("c");
        stringExpected.add("d");
        stringExpected.add("e");
        stringExpected.add("f");

        BinaryTree emptyBinaryTree = new BinaryTree();
        ArrayList<Integer> emptyArray = new ArrayList<>();

        assertEquals(intExpected, intTestBinaryTree.preOrder());
        assertEquals(1,intTestBinaryTree.root.data);
        assertEquals(2,intTestBinaryTree.root.left.data);
        assertEquals(5,intTestBinaryTree.root.right.data);
        assertEquals(emptyArray,emptyBinaryTree.preOrder());
        assertEquals(intExpected,intTestBinaryTree.preOrder());
        assertEquals(stringExpected,stringTestBinaryTree.preOrder());
    }
    @Test
    public void postOrderTest() {
        BinaryTree intTestBinaryTree = new BinaryTree();
        ArrayList<Integer> intExpected = new ArrayList<>();

        intTestBinaryTree.root = new Node(1);
        intTestBinaryTree.root.left = new Node(2);
        intTestBinaryTree.root.left.left = new Node(3);
        intTestBinaryTree.root.left.right = new Node(4);
        intTestBinaryTree.root.right = new Node(5);
        intTestBinaryTree.root.right.left = new Node(6);

        intExpected.add(3);
        intExpected.add(4);
        intExpected.add(2);
        intExpected.add(6);
        intExpected.add(5);
        intExpected.add(1);

        BinaryTree stringTestBinaryTree = new BinaryTree();
        ArrayList<String> stringExpected = new ArrayList<>();

        stringTestBinaryTree.root = new Node("a");
        stringTestBinaryTree.root.left = new Node("b");
        stringTestBinaryTree.root.left.left = new Node("c");
        stringTestBinaryTree.root.left.right = new Node("d");
        stringTestBinaryTree.root.right = new Node("e");
        stringTestBinaryTree.root.right.left = new Node("f");

        stringExpected.add("c");
        stringExpected.add("d");
        stringExpected.add("b");
        stringExpected.add("f");
        stringExpected.add("e");
        stringExpected.add("a");

        BinaryTree emptyBinaryTree = new BinaryTree();
        ArrayList<Integer> emptyArray = new ArrayList<>();

        assertEquals(1,intTestBinaryTree.root.data);
        assertEquals(2,intTestBinaryTree.root.left.data);
        assertEquals(5,intTestBinaryTree.root.right.data);
        assertEquals(emptyArray,emptyBinaryTree.postOrder());
        assertEquals(intExpected,intTestBinaryTree.postOrder());
        assertEquals(stringExpected,stringTestBinaryTree.postOrder());
    }

    @Test
    public void inOrderTest() {
        BinaryTree intTestBinaryTree = new BinaryTree();
        ArrayList<Integer> intExpected = new ArrayList<>();

        intTestBinaryTree.root = new Node(1);
        intTestBinaryTree.root.left = new Node(2);
        intTestBinaryTree.root.left.left = new Node(3);
        intTestBinaryTree.root.left.right = new Node(4);
        intTestBinaryTree.root.right = new Node(5);
        intTestBinaryTree.root.right.left = new Node(6);

        intExpected.add(3);
        intExpected.add(2);
        intExpected.add(4);
        intExpected.add(1);
        intExpected.add(6);
        intExpected.add(5);

        BinaryTree stringTestBinaryTree = new BinaryTree();
        ArrayList<String> stringExpected = new ArrayList<>();

        stringTestBinaryTree.root = new Node("a");
        stringTestBinaryTree.root.left = new Node("b");
        stringTestBinaryTree.root.left.left = new Node("c");
        stringTestBinaryTree.root.left.right = new Node("d");
        stringTestBinaryTree.root.right = new Node("e");
        stringTestBinaryTree.root.right.left = new Node("f");

        stringExpected.add("c");
        stringExpected.add("b");
        stringExpected.add("d");
        stringExpected.add("a");
        stringExpected.add("f");
        stringExpected.add("e");

        BinaryTree emptyBinaryTree = new BinaryTree();
        ArrayList<Integer> emptyArray = new ArrayList<>();

        assertEquals(1,intTestBinaryTree.root.data);
        assertEquals(2,intTestBinaryTree.root.left.data);
        assertEquals(5,intTestBinaryTree.root.right.data);
        assertEquals(emptyArray,emptyBinaryTree.inOrder());
        assertEquals(intExpected,intTestBinaryTree.inOrder());
        assertEquals(stringExpected,stringTestBinaryTree.inOrder());
    }

}