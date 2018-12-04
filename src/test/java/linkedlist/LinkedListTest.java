package linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void testInsert() {
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.insert(1);
        testLinkedList.insert(3);
        testLinkedList.insert(5);
        testLinkedList.insert(9);

        Node head;
        int newHead = testLinkedList.insert(4);
        int headValue = testLinkedList.insert(4).head.data;
        assertEquals(test, expected);

    }

    @Test
    public void testIncludes() {

        LinkedList testLinkedList = new LinkedList();
        testLinkedList.insert(1);
        testLinkedList.insert(3);
        testLinkedList.insert(5);
        testLinkedList.insert(9);

        assertTrue(testLinkedList.includes(3));

    }

    @Test
    public void testPrint() {
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.insert(1);

        testLinkedList.print();



    }
}