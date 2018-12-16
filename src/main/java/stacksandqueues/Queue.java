package stacksandqueues;

public class Queue {
    public Node front;
    public Node last;

    public void queue() {
        this.front = null;
        this.last = null;

    }

    public void enqueue(int value) {

        Node newNode = new Node(value);
        if (front == null) {
            front  = last =  newNode;

        } else {
            last.next = newNode;
            last = newNode;
        }
    }

    public Node dequeue() {
        if (front == null) {
            return null;
        }else {
            Node returnNode = front;
            front = front .next;
            return returnNode;
        }
    }

    public Node peek() {
        if (front == null) {
            return null;
        }else {
            return front;
        }
    }
}
