package graph;

import java.util.HashSet;
import java.util.Set;

public class Graph<T> {
    public Set<Node<T>> nodes;

    public Graph() {
        this.nodes = new HashSet<>();
    }

    public Node addNode(T value) {
        Node<T> newNode = new Node<>(value);
        nodes.add(newNode);
        return newNode;
    }

    public void addEdge(int weight, Node<T> node1, Node<T> node2) {
        if (!this.nodes.contains(node1) || !this.nodes.contains(node2)) {
            throw new IllegalArgumentException("nodes must be in graph");
        }
        node1.addEdge(weight, node2);
        node2.addEdge(weight, node1);
    }

    public Set<Node<T>> getNodes() {
        return this.nodes;

    }

    public Set<Edge<T>> getNeighbors(Node n) {
        if(!this.nodes.contains(n)) {
            throw new IllegalArgumentException("node must be in graph");
        }
        return n.neighbors;
    }

    public int size() {
        return this.nodes.size();
    }


}
