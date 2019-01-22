package TreeIntersection;

import Tree.Node;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;

public class TreeIntersectionTest {

    @Test
    public void treeIntersectionTest() {
        TreeIntersection testTreeIntersection = new TreeIntersection();

        Node rootA = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        rootA.left = node2;
        rootA.right = node3;
        node3.left = node4;

        Node rootB = new Node(1);
        Node node7 = new Node(7);
        Node node3b = new Node(3);
        Node node9 = new Node(9);

        rootB.left = node7;
        rootB.right = node3b;
        node3b.left = node9;

        HashSet<Object> expected = new HashSet<>();
        expected.add(1);
        expected.add(3);

        assertEquals(expected,testTreeIntersection.treeIntersection(rootA,rootB));
    }

    @Test
    public void treeIntersectionEmptyTest() {
        TreeIntersection testTreeIntersection = new TreeIntersection();

        Node rootA = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        rootA.left = node2;
        rootA.right = node3;
        node3.left = node4;

        Node rootB = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);

        rootB.left = node6;
        rootB.right = node7;
        node6.left = node8;

        HashSet<Object> expected = new HashSet<>();

        assertEquals(expected,testTreeIntersection.treeIntersection(rootA,rootB));
    }

    @Test
    public void treeIntersectionAllMatch() {
        TreeIntersection testTreeIntersection = new TreeIntersection();

        Node rootA = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        rootA.left = node2;
        rootA.right = node3;
        node3.left = node4;

        Node rootB = new Node(1);
        Node node2B = new Node(2);
        Node node3B = new Node(3);
        Node node4B = new Node(4);

        rootB.left = node2B;
        rootB.right = node3B;
        node3B.left = node4B;

        HashSet<Object> expected = new HashSet<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);

        assertEquals(expected,testTreeIntersection.treeIntersection(rootA,rootB));
    }


}