package org.sdag.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Graph implements IMyGraph{
    List<GNode> nodes;
    List<GEdge> edges;

    public Graph() {
        this.nodes = new ArrayList<>();
        this.edges = new LinkedList<>();
    }

    @Override
    public int getNumberOfVertices() {
        return nodes.size();
    }

    @Override
    public GNode[] getVertices() {
        return nodes.toArray(new GNode[0]);
    }

    @Override
    public int getNumberOfEdges() {
        return edges.size();
    }

    @Override
    public GEdge[] getEdges() {
        return edges.toArray(new GEdge[0]);
    }

    @Override
    public GEdge getEdge(GNode source, GNode destination) {
        for (GEdge edge: edges) {
            if(edge.getSource().equals(source) && edge.getDestination().equals(destination)){
                return edge;
            }
        }
        return null;
    }

    @Override
    public int outDegree(GNode node) {
        int count = 0;
        for (GEdge edge: edges) {
            if(edge.getSource().equals(node)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int inDegree(GNode node) {
        int count = 0;
        for (GEdge edge: edges) {
            if(edge.getDestination().equals(node)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public GEdge[] outgoingEdges(GNode node) {
        List<GEdge> outgoing = new ArrayList<>();
        for (GEdge edge: edges) {
            if(edge.getSource().equals(node)) {
                outgoing.add(edge);
            }
        }
        return outgoing.toArray(new GEdge[0]);
    }

    @Override
    public GEdge[] incomingEdges(GNode node) {
        List<GEdge> incoming = new ArrayList<>();
        for (GEdge edge: edges) {
            if(edge.getDestination().equals(node)) {
                incoming.add(edge);
            }
        }
        return incoming.toArray(new GEdge[0]);
    }

    @Override
    public void addNode(GNode node) {
        nodes.add(node);
    }

    @Override
    public void addEdge(GNode source, GNode destination, int weight) {
        GEdge edge = new GEdge(source, destination, weight);
        edges.add(edge);
    }

    @Override
    public void removeNode(GNode node) {
        nodes.remove(node);
        edges.removeIf(edge -> edge.getSource().equals(node) || edge.getDestination().equals(node));
    }

    @Override
    public void removeEdge(GEdge edge) {
        edges.remove(edge);
    }

    @Override
    public void print() {
        System.out.println("Nodes:");
        for (GNode node : nodes) {
            System.out.println(node.getNodeId());
        }

        System.out.println("\nEdges:");
        for (GEdge edge : edges) {
            System.out.println(edge.toString());
        }
    }
}
