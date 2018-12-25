package stacksandqueues;

public class Stack<T> {
    public Node<T> top;
    public void stack(){

        this.top = null;
    }

    public void push(T value){
        Node<T> newNode = new Node<T>(value);

        if(top == null){
            top = newNode;
        }else {
            newNode.next = top;
            top = newNode;
        }

    }

    public Node<T> pop() {
        if (top == null) {
            return null;
        }
        Node<T> popped = top;
        if (top.next == null){
            top = null;
        }else {
            top = top.next;
        }


        return popped;
    }

    public Node<T> peek() {
        if (top == null) {
            return null;
        }
        return top;
    }





}
