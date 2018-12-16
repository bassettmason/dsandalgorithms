package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;


public class NodeTest {
    @Test
    public void nodeTest() {


        Node newNode = new Node(2);
        assertEquals(2, newNode.data);

        assertEquals(null, newNode.next);



    }

}