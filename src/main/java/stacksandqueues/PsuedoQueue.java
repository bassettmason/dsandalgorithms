package stacksandqueues;

public class PsuedoQueue {

    public void psuedoQueue() {

    }
    public Stack enqueueStack = new Stack();
    public Stack dequeueStack = new Stack();

    public void transferToEnqueue() {
        while(dequeueStack.peek() != null) {

            enqueueStack.push(dequeueStack.pop().data);
        }
    }
    public void transferToDequeue() {
        while(enqueueStack.peek() != null) {

            dequeueStack.push(enqueueStack.pop().data);
        }
    }

    public Node enqueue(int value){
        if(enqueueStack.peek() == null && dequeueStack.peek() == null) {
            enqueueStack.push(value);
            return enqueueStack.peek();
        }

        if(enqueueStack.peek() != null){
            enqueueStack.push(value);
            return enqueueStack.peek();
        }else {
            transferToEnqueue();
            enqueueStack.push(value);
            return enqueueStack.peek();
        }
    }
    public Node peek(){
        if(enqueueStack.peek() == null && dequeueStack.peek() == null) {
            return null;
        }

        if(enqueueStack.peek() != null){
            return enqueueStack.peek();
        }else {
            transferToEnqueue();
            return enqueueStack.peek();
        }

    }

    public Node dequeue(){
        if(enqueueStack.peek() == null && dequeueStack.peek() == null) {
            return null;
        }
        if(dequeueStack.peek() != null){
            return dequeueStack.pop();
        }else {
            transferToDequeue();
            return dequeueStack.pop();
        }
    }



}
