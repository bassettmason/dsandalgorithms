package stacksandqueues;

public class Stack {
    public Node top;
//    Stack stack = new Stack();
    public Stack() {


        this.top = null;

        public static void push (int value){
            Node newNode = new Node(value);
            if (top == null){
                top = newNode;
            }else {
                newNode.next = top;
                top = newNode;
            }
        }

    }

}


