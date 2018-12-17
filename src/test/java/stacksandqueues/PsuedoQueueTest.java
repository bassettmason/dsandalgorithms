package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class PsuedoQueueTest {

    @Test
    public void queueTest(){
        PsuedoQueue testQueue = new PsuedoQueue();
        testQueue.enqueue(5);
        assertNotNull(testQueue);
        assertNull(testQueue.peek());
        assertNull(testQueue.dequeue());
    }

    @Test
    public void transferToEnqueue() {
        Stack enqueueStack  = new Stack();


        Stack dequeueStack  = new Stack();
        dequeueStack.push(1);
        dequeueStack.push(2);
        dequeueStack.push(3);

        transferToEnqueue();
        assertEquals(3, enqueueStack.peek().data);
    }



    @Test
    public void transferToDequeue() {
    }

    @Test
    public void enqueue() {
    }

    @Test
    public void peek() {
    }

    @Test
    public void dequeue() {
    }
}