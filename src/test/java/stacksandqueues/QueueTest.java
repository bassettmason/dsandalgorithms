package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    @Test
    public void queueTest() {
        Queue newQueue = new Queue();

        assertEquals(null, newQueue.front);
    }

    @Test
    public void enqueue() {
        Queue newQueue = new Queue();
        newQueue.enqueue(4);
        newQueue.enqueue(5);
        newQueue.enqueue(6);

        assertEquals(4, newQueue.front.data);
        assertEquals(5, newQueue.front.next.data);
        assertEquals(6, newQueue.last.data);
    }

    @Test
    public void dequeue() {

        Queue newQueue = new Queue();
        newQueue.enqueue(4);
        newQueue.enqueue(5);
        newQueue.enqueue(6);
        newQueue.enqueue(7);
        newQueue.enqueue(8);
        newQueue.enqueue(9);

        int test1 = newQueue.dequeue().data;
        int test2 = newQueue.dequeue().data;
        int test3 = newQueue.dequeue().data;

        assertEquals(4, test1);
        assertEquals(5, test2);
        assertEquals(6, test3);
        assertEquals(7, newQueue.front.data);
        assertEquals(9, newQueue.last.data);
    }

    @Test
    public void peakTest() {

        Queue newQueue = new Queue();
        newQueue.enqueue(4);
        newQueue.enqueue(5);
        newQueue.enqueue(6);
        newQueue.enqueue(7);
        newQueue.enqueue(8);
        newQueue.enqueue(9);

        Queue nullQueue = new Queue();


        assertEquals(4, newQueue.peak().data);
        assertEquals(null, nullQueue.peak());


    }
}