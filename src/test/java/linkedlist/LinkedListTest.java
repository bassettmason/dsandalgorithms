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

        Node curr = testLinkedList.head;
        int i = 0;
        while(curr != null){

            i++;
            curr = curr.next;
        }
        assertTrue(i == 4);
        assertTrue(testLinkedList.head.data == 9);
        assertTrue(testLinkedList.head.next.data == 5);


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
        assertEquals(testLinkedList.includes(3), true);
        assertFalse(testLinkedList.includes(2));
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
    public void testAppend() {
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.prepend(1);
        testLinkedList.prepend(3);
        testLinkedList.prepend(5);
        testLinkedList.prepend(9);

        testLinkedList.append(4);

        int i = 0;
        int tail = 0;
        Node curr = testLinkedList.head;
        while(curr != null){
            if (curr.next == null) {
                tail = curr.data;
                i++;
                break;
            }
            i++;
            curr = curr.next;
        }
        System.out.print(i);
        assertTrue(tail == 4);
        assertTrue(i == 5);
        assertTrue(testLinkedList.includes(4));
    }

    @Test
    public void testInsertBefore() {
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.prepend(1);
        testLinkedList.prepend(3);
        testLinkedList.prepend(5);
        testLinkedList.prepend(9);

        testLinkedList.insertBefore(5, 4);
        Node curr = testLinkedList.head;
        int i = 0;
        while(curr != null){

            i++;
            curr = curr.next;
        }
        System.out.print(i);
        assertTrue(testLinkedList.head.next.data == 4);
        assertTrue(i == 5);
        assertTrue(testLinkedList.includes(4));
    }


    @Test
    public void testInsertAfter() {

        LinkedList testLinkedList = new LinkedList();
        testLinkedList.prepend(1);
        testLinkedList.prepend(3);
        testLinkedList.prepend(5);
        testLinkedList.prepend(9);

        testLinkedList.insertAfter(9, 4);
        Node curr = testLinkedList.head;
        int i = 0;
        while(curr != null){

            i++;
            curr = curr.next;
        }
        System.out.print(i);
        assertTrue(i == 5);
        assertTrue(testLinkedList.head.next.data == 4);
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


    @Test
    public void mergeTest() {
        LinkedList listA = new LinkedList();
        listA.prepend(2);
        listA.prepend(4);
        listA.prepend(6);
        listA.prepend(8);

        LinkedList listB = new LinkedList();
        listB.prepend(1);
        listB.prepend(3);
        listB.prepend(5);
        listB.prepend(9);
        listB.prepend(11);

        LinkedList newHead = LinkedList.merge(listA, listB);

        Node curr = newHead.head;
        int i = 0;
        while(curr != null){

            i++;
            curr = curr.next;
        }
        assertTrue(i == 9);
        assertTrue(newHead.head.data == 8);
        assertTrue(newHead.head.next.data == 11);

    }
}