package graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Graph<T> {
    public Set<Node<T>> nodes;

    public Graph() {
        this.nodes = new HashSet<>();
    }


    public static Iterable<Node> breadthFirst(Node input){
        LinkedList<Node> queue = new LinkedList<>();

        Queue<Node> nodesLeft = new LinkedList<>();
        nodesLeft.add(input);

        HashSet<Node> nodesDone = new HashSet<>();
        nodesDone.add(input);
        while(!nodesLeft.isEmpty()){
            Node el = nodesLeft.poll();
            queue.add(el);
            for(Edge neighbor : (Set<Edge>) el.neighbors){
                Node nodeNeighbor = neighbor.node;
                if(!nodesDone.contains(nodeNeighbor)){
                    nodesLeft.add(nodeNeighbor);
                    nodesDone.add(nodeNeighbor);
                }
            }
        }
        return queue;
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
