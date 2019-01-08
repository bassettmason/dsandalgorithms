package graph;

import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;

public class GraphTest {

    @Test
    public void testAddNode() {
        Graph<String> testGraph = new Graph<>();
        Node<String> newNode1 = testGraph.addNode("A");

        assertEquals("A", newNode1.value);
        assertEquals(1, testGraph.nodes.size());

        Node<String> newNode2 = testGraph.addNode("B");
        assertEquals("B", newNode2.value);
        assertEquals(2, testGraph.nodes.size());

    }

    @Test
    public void testAddEdge() {
        Graph<String> testGraph = new Graph<>();
        Node<String> newNode1 = testGraph.addNode("A");
        Node<String> newNode2 = testGraph.addNode("B");

        HashSet<Node<String>> testSet = new HashSet<>();
        assertTrue(testSet.containsAll(newNode1.neighbors));

        testGraph.addEdge(1, newNode1, newNode2);

        testSet.add(newNode2);


        assertEquals(1, newNode1.neighbors.size());
        assertEquals(1, newNode2.neighbors.size());

    }


    @Test
    public void testGetNodes() {
        Graph<String> testGraph = new Graph<>();
        Node<String> newNode1 = testGraph.addNode("A");
        Node<String> newNode2 = testGraph.addNode("B");

        assertEquals(testGraph.nodes, testGraph.getNodes());
        Node<String> newNode3 = testGraph.addNode("C");
        assertEquals(testGraph.nodes, testGraph.getNodes());
        Node<String> newNode4 = testGraph.addNode("D");
        assertEquals(testGraph.nodes, testGraph.getNodes());




    }

    @Test
    public void testGetNeighbors() {

        Graph<String> testGraph = new Graph<>();
        Node<String> newNode1 = testGraph.addNode("A");
        Node<String> newNode2 = testGraph.addNode("B");

        HashSet<Node<String>> testSet = new HashSet<>();
        assertTrue(testSet.containsAll(newNode1.neighbors));

        testGraph.addEdge(1, newNode1, newNode2);

        testSet.add(newNode2);


        assertEquals(1, newNode1.neighbors.size());
        assertEquals(1, newNode2.neighbors.size());
    }

    @Test
    public void testSize() {
        Graph<String> testGraph = new Graph<>();
        Node<String> newNode1 = testGraph.addNode("A");

        assertEquals("A", newNode1.value);
        assertEquals(1, testGraph.nodes.size());

        Node<String> newNode2 = testGraph.addNode("B");
        assertEquals("B", newNode2.value);
        assertEquals(2, testGraph.nodes.size());
    }
}