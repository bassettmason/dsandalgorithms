package stacksandqueues;

public class Stack {
    public Node top;
    public void stack(){
        this.top = null;
    }
    public void push(int value){
        Node newNode = new Node(value);

        if(top == null){
            newNode.next = top;
            top= newNode;
        }

    }

    public Node pop() {
        if (top == null) {

        }
        Node popped = top;
        if (top.next == null){
            top = null;
        }else {
            top = top.next;
        }


        return popped;
    }

    public Node peek() {
        if (top == null) {
            return null;
        }
        return top;
    }





}
