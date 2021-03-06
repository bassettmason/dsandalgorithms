package graph;


import java.util.*;

public class Graph<T> {
    public Set<Node<T>> nodes;

    public Graph() {
        this.nodes = new HashSet<>();
    }


    public static Iterable<Node> breadthFirst(Node startNode){
        LinkedList<Node> queue = new LinkedList<>();

        Queue<Node> nodesLeft = new LinkedList<>();
        nodesLeft.add(startNode);

        HashSet<Node> nodesDone = new HashSet<>();
        nodesDone.add(startNode);
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

    public static Iterable<Node> depthFirst(graph.Node startNode){
        LinkedList<Node> returnStack = new LinkedList<>();

        Stack<Node> nodesLeft = new Stack<>();
        nodesLeft.push(startNode);

        HashSet<Node> nodesDone = new HashSet<>();
        nodesDone.add(startNode);

        while(!nodesLeft.isEmpty()) {
            Node curr =  nodesLeft.pop();
            returnStack.add(curr);
            for(Edge neighbor : (Set<Edge>) curr.neighbors){
                Node neighborNode = neighbor.node;
                if (!nodesDone.contains(neighborNode)){
                    nodesLeft.push(neighborNode);
                    nodesDone.add(neighborNode);
            }

            }
        }
        return returnStack;
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

    public String getEdge(String[] cities){
        int edgeWeight = 0;
        Node<T> originCity = null;

        for(Node<T> city : nodes){
            if(city.value == cities[0]){
                originCity = city;
            }
        }
        //no city return false
        if (originCity == null){
            return "False, " + 0;
        }

        for(int i = 1; i < cities.length; i++){
            for(Edge<T> edge : originCity.neighbors){
                if(edge.node.value == cities[i]){
                    originCity = edge.node;
                    edgeWeight += edge.weight;
                }
            }
            if (originCity.value != cities[i]) {
                return "False, " + "Price: " + "$" + "0";
            }
        }
        return "True, " + "Price: " + "$" + edgeWeight;
    }





}
