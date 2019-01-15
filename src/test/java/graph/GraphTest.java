package graph;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;

import static org.junit.Assert.*;

public class GraphTest {


    @Test
    public void testConstructor(){
        Graph<String> g = new Graph<>();
        assertEquals(0, g.nodes.size());
    }

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
        assertEquals(1,newNode1.neighbors.iterator().next().weight);
        assertEquals(newNode1, newNode2.neighbors.iterator().next().node);

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
        Node<String> newNode3 = testGraph.addNode("C");



        HashSet<Node<String>> testSet = new HashSet<>();
        assertTrue(testSet.containsAll(newNode1.neighbors));

        testGraph.addEdge(1, newNode1, newNode2);
        testGraph.addEdge(2, newNode1, newNode3);

        testSet.add(newNode2);


        assertEquals(2, newNode1.neighbors.size());
        assertEquals(1, newNode2.neighbors.size());
        assertEquals(1, newNode3.neighbors.size());
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

    @Test
    public void breadthFirst() {

        Graph<String> testGraph = new Graph<>();
        Node<String> A = testGraph.addNode("A");
        Node<String> B = testGraph.addNode("B");
        Node<String> C = testGraph.addNode("C");
        Node<String> D = testGraph.addNode("D");





        testGraph.addEdge(1, A, B);
        testGraph.addEdge(1, B, C);
        testGraph.addEdge(1, B, D);
        testGraph.addEdge(1, C, D);

        Iterator<Node> iteratorResult = testGraph.breadthFirst(A).iterator();
        assertEquals(A, iteratorResult.next());
        assertEquals(B, iteratorResult.next());
        assertEquals(D, iteratorResult.next());
        assertEquals(C, iteratorResult.next());


    }

}