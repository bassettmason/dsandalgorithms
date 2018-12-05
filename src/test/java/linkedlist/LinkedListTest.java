package linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void testPrepend() {
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.prepend(1);
        testLinkedList.prepend(3);
        testLinkedList.prepend(5);
        testLinkedList.prepend(9);

        assertTrue(testLinkedList.kth_from_end(1) == 5);



        assertTrue(testLinkedList.head.data == 9);


    }

    @Test
    public void testIncludes() {

        LinkedList testLinkedList = new LinkedList();
        testLinkedList.prepend(1);
        testLinkedList.prepend(3);
        testLinkedList.prepend(5);
        testLinkedList.prepend(9);
        assertTrue(testLinkedList.head.data == 9);

        assertEquals(testLinkedList.includes(5), true);

    }

    @Test
    public void testPrint() {
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.prepend(1);
        testLinkedList.print();

        String result = "1" + "\n";

//        assertEquals(result, testLinkedList.print().toString);





    }

    @Test
    public void append() {
    }

    @Test
    public void insertBefore() {
    }

    @Test
    public void insertAfter() {
    }
    @Test
    public void testKth_From_The_End() {
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.prepend(1);
        testLinkedList.prepend(3);
        testLinkedList.prepend(5);
        testLinkedList.prepend(9);

        assertTrue(testLinkedList.kth_from_end(1) == 3);
        assertTrue(testLinkedList.kth_from_end(0) == 1);
        assertTrue(testLinkedList.kth_from_end(2) == 5);


    }
}