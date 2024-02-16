package org.sdag.graphs;

import org.sdag.interfaces.IRunner;

import java.util.Scanner;

public class GraphRunner implements IRunner {

    Graph graph = new Graph();
    boolean bool = true;

    @Override
    public void run() {
        while (bool) {
            printMenuGraph();
            handler();
        }
    }

    public void handler() {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Number of Vertices: " + graph.getNumberOfVertices());
                break;
            case 2:
                System.out.println("Vertices: ");
                GNode[] vertices = graph.getVertices();
                for (GNode node : vertices) {
                    System.out.println(node.getNodeId());
                }
                break;
            case 3:
                System.out.println("Number of Edges: " + graph.getNumberOfEdges());
                break;
            case 4:
                System.out.println("Edges: ");
                GEdge[] edges = graph.getEdges();
                for (GEdge edge : edges) {
                    System.out.println(edge.toString());
                }
                break;
            case 5:
                System.out.println("Enter source and destination for the edge (separated by space): ");
                String sourceId = scanner.next();
                String destinationId = scanner.next();
                GNode sourceNode = new GNode(sourceId);
                GNode destinationNode = new GNode(destinationId);
                GEdge edge = graph.getEdge(sourceNode, destinationNode);
                if (edge != null) {
                    System.out.println("Edge found: " + edge);
                } else {
                    System.out.println("Edge not found.");
                }
                break;
            case 6:
                System.out.println("Enter a node's ID to get its out degree: ");
                String nodeOut = scanner.next();
                GNode nodeout = new GNode(nodeOut);
                System.out.println("Out degree of node " + nodeOut + ": " + graph.outDegree(nodeout));
                break;
            case 7:
                System.out.println("Enter a node's ID to get its in degree: ");
                String nodeIn = scanner.next();
                GNode nodein = new GNode(nodeIn);
                System.out.println("In degree of node " + nodeIn + ": " + graph.inDegree(nodein));
                break;
            case 8:
                System.out.println("Enter a node's ID to get its outgoing edges: ");
                String nodeId8 = scanner.next();
                GNode node8 = new GNode(nodeId8);
                GEdge[] outgoingEdges = graph.outgoingEdges(node8);
                System.out.println("Outgoing edges of node " + nodeId8 + ": ");
                for (GEdge ed : outgoingEdges) {
                    System.out.println(ed.toString());
                }
                break;
            case 9:
                System.out.println("Enter a node's ID to get its incoming edges: ");
                String nodeId9 = scanner.next();
                GNode node9 = new GNode(nodeId9);
                GEdge[] incomingEdges = graph.incomingEdges(node9);
                System.out.println("Incoming edges of node " + nodeId9 + ": ");
                for (GEdge eds : incomingEdges) {
                    System.out.println(eds.toString());
                }
                break;
            case 10:
                System.out.println("Enter the ID of the new node to add: ");
                String newNodeId = scanner.next();
                GNode newNode = new GNode(newNodeId);
                graph.addNode(newNode);
                System.out.println("Node added: " + newNodeId);
                break;
            case 11:
                System.out.println("Enter source, destination, and weight for the new edge (separated by space): ");
                String newSourceId = scanner.next();
                String newDestinationId = scanner.next();
                int newWeight = scanner.nextInt();
                GNode newSourceNode = new GNode(newSourceId);
                GNode newDestinationNode = new GNode(newDestinationId);
                graph.addEdge(newSourceNode, newDestinationNode, newWeight);
                System.out.println("Edge added: (" + newSourceId + " -> " + newDestinationId + ", Weight: " + newWeight + ")");
                break;
            case 12:
                System.out.println("Enter the ID of the node to remove: ");
                String removeNodeId = scanner.next();
                GNode removeNode = new GNode(removeNodeId);
                graph.removeNode(removeNode);
                System.out.println("Node removed: " + removeNodeId);
                break;
            case 13:
                System.out.println("Enter source and destination for the edge to remove (separated by space): ");
                String removeSourceId = scanner.next();
                String removeDestinationId = scanner.next();
                GNode removeSourceNode = new GNode(removeSourceId);
                GNode removeDestinationNode = new GNode(removeDestinationId);
                GEdge removeEdge = graph.getEdge(removeSourceNode, removeDestinationNode);
                graph.removeEdge(removeEdge);
                System.out.println("Edge removed: (" + removeSourceId + " -> " + removeDestinationId + ")");
                break;
            case 14:
                System.out.println("Printing the graph:");
                graph.print();
                break;
            case 15:
                System.out.println("Exiting the graph menu.");
                System.out.println("Are you sure you want to exit?");
                System.out.println("Enter 'y' to exit or any other key to continue.");
                char decide = scanner.next().toLowerCase().charAt(0);
                if (decide == 'y') {
                    bool = false;
                }
                return;
            default:
                System.out.println("Invalid option. Please choose a valid option.");
                break;
        }
    }

    public static void printMenuGraph() {
        System.out.println("Welcome to Graphs");
        System.out.println("Choose an option: ");
        System.out.println("1 - Get number of vertices");
        System.out.println("2 - Get vertices");
        System.out.println("3 - Get number of edges");
        System.out.println("4 - Get edges");
        System.out.println("5 - Get an edge");
        System.out.println("6 - Get out degree of a node");
        System.out.println("7 - Get in degree of a node");
        System.out.println("8 - Get outgoing edges of a node");
        System.out.println("9 - Get incoming edges of a node");
        System.out.println("10 - Add a new node");
        System.out.println("11 - Add a new edge");
        System.out.println("12 - Remove a node");
        System.out.println("13 - Remove an edge");
        System.out.println("14 - Print the Graph");
        System.out.println("15 - Exit");
    }
}
