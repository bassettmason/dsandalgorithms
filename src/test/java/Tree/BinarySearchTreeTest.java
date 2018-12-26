package Tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    @Test
    public void createBinarySearchTreeTest() {
        BinarySearchTree test = new BinarySearchTree();
//
        test.add(6);
        test.add(3);
        test.add(2);
        test.add(12);
        test.add(30);
        test.add(9);

        Object testNodeData = test.root.right.data;
        Object testNodeData2 = test.root.data;
        Object testNodeData3 = test.root.left.data;

        assertEquals(12, testNodeData);
        assertEquals(6, testNodeData2);
        assertEquals(3, testNodeData3);

    }

    @Test
    public void addTest() {

       BinarySearchTree test = new BinarySearchTree();
        test.add(6);
        test.add(3);
        test.add(2);
        test.add(12);
        test.add(30);
        test.add(9);

        Object testNodeData = test.root.right.data;
        Object testNodeData2 = test.root.data;
        Object testNodeData3 = test.root.left.data;

        assertEquals(12, testNodeData);
        assertEquals(6, testNodeData2);
        assertEquals(3, testNodeData3);

    }

    @Test
    public void containsTest() {
        BinarySearchTree test = new BinarySearchTree();
        test.add(6);
        test.add(3);
        test.add(2);
        test.add(12);
        test.add(30);
        test.add(9);


        assertTrue(test.contains(6));
        assertTrue(test.contains(12));
        assertTrue(test.contains(9));
        assertFalse(test.contains(5));


    }
}