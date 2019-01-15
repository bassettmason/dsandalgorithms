package graph;

public class Edge<T> {

    public int weight;
    public Node<T> node;

    public Edge(Node<T> node) {
        this(1, node);
    }

    public Edge(int weight, Node<T> node) {
        this.weight = weight;
        this.node = node;
    }


}
