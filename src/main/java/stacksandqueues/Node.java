package stacksandqueues;

public class Node<T> {

    public T data;
    public stacksandqueues.Node next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

}
