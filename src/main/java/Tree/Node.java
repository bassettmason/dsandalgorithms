package Tree;

public class Node<T extends Comparable<T>> implements Comparable<Node<T>>
{
    public T data;
    public Node<T> left;
    public Node<T> right;

    //constructors
    public Node(T data)
    {
        this.data = data;
        left = null;
        right = null;
    }
//experiment on whether I can have two node constructors one makes left and right null and only takes in T data the other takes in all value
//    public Node(T data, Node<T> left, Node<T> right)
//    {
//        this.data = data;
//        this.left = left;
//        this.right = right;
//    }


    //returns current data

    // Returns your T generic type.
//    public T getData()
//    {
//        return this.data;
//    }

    // This now compares to a Node.

    public int compareTo(Node<T> other)
    {
        return this.data.compareTo(other.data);
    }
}


