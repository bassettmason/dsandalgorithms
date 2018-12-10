package stacksandqueues;

public class Queue {
    public Node front;

    public void stack() {
        this.front = null;
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (front == null) {
            front = newNode;
        }

        newNode.next = front;

    }

    public Node dequeue() {
        if (front == null) {
            return null;
        }
        Node curr = front;
        Node after = front;
        after = curr.next;
        while (after != null) {
            if (after.next == null) {
                curr.next = null;
                front = curr;
                return after;
            }
            after = after.next;
            curr = curr.next;
        }
        return null;
    }
}
