package graphtest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.sdag.graphs.GEdge;
import org.sdag.graphs.GNode;
import org.sdag.graphs.Graph;
import org.sdag.graphs.IMyGraph;

public class GraphsTests {
    IMyGraph graph = new Graph();
    @Test
    public void testGetNumberOfVertices() {
        GNode node1 = new GNode("A");
        GNode node2 = new GNode("B");
        GNode node3 = new GNode("C");
        graph.addNode(node1);
        graph.addNode(node2);
        graph.addNode(node3);

        Assertions.assertEquals(3, graph.getNumberOfVertices());
    }

    @Test
    public void testGetVertices() {

        GNode node1 = new GNode("A");
        GNode node2 = new GNode("B");

        graph.addNode(node1);
        graph.addNode(node2);

        GNode[] vertices = graph.getVertices();
        Assertions.assertArrayEquals(new GNode[]{node1, node2}, vertices);
    }

    @Test
    public void testGetNumberOfEdges() {
        IMyGraph graph = new Graph();

        GNode node1 = new GNode("A");
        GNode node2 = new GNode("B");
        GNode node3 = new GNode("C");
        GNode node4 = new GNode("D");

        graph.addNode(node1);
        graph.addNode(node2);
        graph.addNode(node3);
        graph.addNode(node4);
        graph.addEdge(node1, node2, 5);
        graph.addEdge(node2, node3, 4);
        graph.addEdge(node3, node4, 3);
        graph.addEdge(node4, node1, 2);


        Assertions.assertEquals(4, graph.getNumberOfEdges());
    }

    @Test
    public void testGetEdges() {
        IMyGraph graph = new Graph();

        GNode node1 = new GNode("A");
        GNode node2 = new GNode("B");

        graph.addNode(node1);
        graph.addNode(node2);
        graph.addEdge(node1, node2, 5);

        GEdge[] edges = graph.getEdges();
        Assertions.assertEquals(1, edges.length);
        Assertions.assertEquals(node1, edges[0].getSource());
        Assertions.assertEquals(node2, edges[0].getDestination());
        Assertions.assertEquals(5, edges[0].getWeight());
    }

    /*@Test
    public void testGetEdge() {
        IMyGraph graph = new Graph();

        GNode node1 = new GNode("A");
        GNode node2 = new GNode("B");

        graph.addNode(node1);
        graph.addNode(node2);
        graph.addEdge(node1, node2, 5);

        GEdge edge = graph.getEdge(node1, node2);
        Assertions.assertNull(edge);
        Assertions.assertEquals(5, edge.getWeight());
    }*/

    @Test
    public void testOutDegree() {
        GNode node1 = new GNode("A");
        GNode node2 = new GNode("B");

        graph.addNode(node1);
        graph.addNode(node2);
        graph.addEdge(node1, node2, 5);

        Assertions.assertEquals(1, graph.outDegree(node1));
        Assertions.assertEquals(0, graph.outDegree(node2));
    }

    @Test
    public void testInDegree() {
        GNode node1 = new GNode("A");
        GNode node2 = new GNode("B");

        graph.addNode(node1);
        graph.addNode(node2);
        graph.addEdge(node1, node2, 5);

        Assertions.assertEquals(0, graph.inDegree(node1));
        Assertions.assertEquals(1, graph.inDegree(node2));
    }

    @Test
    public void testOutgoingEdges() {
        GNode node1 = new GNode("A");
        GNode node2 = new GNode("B");

        graph.addNode(node1);
        graph.addNode(node2);
        graph.addEdge(node1, node2, 5);

        GEdge[] outgoingEdges = graph.outgoingEdges(node1);
        Assertions.assertEquals(1, outgoingEdges.length);
        Assertions.assertEquals(node1, outgoingEdges[0].getSource());
        Assertions.assertEquals(node2, outgoingEdges[0].getDestination());
        Assertions.assertEquals(5, outgoingEdges[0].getWeight());
    }

    @Test
    public void testIncomingEdges() {
        GNode node1 = new GNode("A");
        GNode node2 = new GNode("B");

        graph.addNode(node1);
        graph.addNode(node2);
        graph.addEdge(node1, node2, 5);

        GEdge[] incomingEdges = graph.incomingEdges(node2);
        Assertions.assertEquals(1, incomingEdges.length);
        Assertions.assertEquals(node1, incomingEdges[0].getSource());
        Assertions.assertEquals(node2, incomingEdges[0].getDestination());
        Assertions.assertEquals(5, incomingEdges[0].getWeight());
    }

    @Test
    public void testAddNode() {
        IMyGraph graph = new Graph();

        GNode node = new GNode("A");
        graph.addNode(node);

        Assertions.assertEquals(1, graph.getNumberOfVertices());
        Assertions.assertArrayEquals(new GNode[]{node}, graph.getVertices());
    }

    /*@Test
    public void testAddEdge() {
        IMyGraph graph = new Graph();

        GNode node1 = new GNode("A");
        GNode node2 = new GNode("B");

        graph.addNode(node1);
        graph.addNode(node2);
        graph.addEdge(node1, node2, 5);

        Assertions.assertEquals(1, graph.getNumberOfEdges());
        Assertions.assertArrayEquals(new GEdge[]{new GEdge(node1, node2, 5)}, graph.getEdges());
    }*/

    @Test
    public void testRemoveNode() {
        IMyGraph graph = new Graph();

        GNode node1 = new GNode("A");
        GNode node2 = new GNode("B");

        graph.addNode(node1);
        graph.addNode(node2);

        graph.removeNode(node1);

        Assertions.assertEquals(1, graph.getNumberOfVertices());
        Assertions.assertArrayEquals(new GNode[]{node2}, graph.getVertices());
    }

    /*@Test
    public void testRemoveEdge() {
        IMyGraph graph = new Graph();

        GNode node1 = new GNode("A");
        GNode node2 = new GNode("B");

        graph.addNode(node1);
        graph.addNode(node2);
        graph.addEdge(node1, node2, 5);

        graph.removeEdge(new GEdge(node1, node2, 5));

        Assertions.assertEquals(0, graph.getNumberOfEdges());
        Assertions.assertArrayEquals(new GEdge[]{}, graph.getEdges());
    }*/
}
