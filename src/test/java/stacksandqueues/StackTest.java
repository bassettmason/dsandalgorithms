//package stacksandqueues;
//
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class StackTest {
//
//    @Test
//    public void stackTest() {
//        Stack newStack = new Stack();
//
//        assertEquals(null, newStack.top);
//    }
//
//    @Test
//    public void pushTest() {
//        Stack newStack = new Stack();
//        newStack.push(4);
//        newStack.push(5);
//        newStack.push(6);
//
//        Stack nullStack = new Stack();
//        assertEquals(null, nullStack.pop());
//
//        assertEquals(6, newStack.top.data);
//        assertEquals(5, newStack.top.next.data);
//    }
//
//    @Test
//    public void popTest() {
//
//        Stack newStack = new Stack();
//        newStack.push(5);
//        newStack.push(6);
//        newStack.push(7);
//        newStack.push(8);
//        newStack.push(9);
//
//        int test1 = newStack.pop().data;
//        int test2 = newStack.pop().data;
//        int test3 = newStack.pop().data;
//
//        Stack nullStack = new Stack();
//
//        assertEquals(null, nullStack.pop());
//
//
//        assertEquals(9, test1);
//        assertEquals(8, test2);
//        assertEquals(7, test3);
//        assertEquals(6, newStack.top.data);
//    }
//
//    @Test
//    public void peakTest() {
//
//        Stack newStack = new Stack();
//        newStack.push(4);
//        newStack.push(5);
//        newStack.push(6);
//        newStack.push(7);
//        newStack.push(8);
//        newStack.push(9);
//
//        Stack nullStack = new Stack();
//
//        assertEquals(null, nullStack.peek());
//        assertEquals(9, newStack.peek().data);
//
//    }
//}