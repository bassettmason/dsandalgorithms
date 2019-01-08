package graph;

import java.util.HashSet;
import java.util.Set;

public class Node<T> {
    public T value;

    public Set<Edge<T>> neighbors;

    public Node() {
        this(null);
    }

    public Node (T value) {
        this.value = value;
        this.neighbors = new HashSet<>();
    }

    protected void addEdge(int weight, Node<T> neighbor) {
        Edge<T> newEdge = new Edge(weight, neighbor);
        this.neighbors.add(newEdge);
    }
}
