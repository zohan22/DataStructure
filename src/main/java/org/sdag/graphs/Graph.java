package org.sdag.graphs;

public class Graph implements IMyGraph{
    @Override
    public int getNumberOfVertices() {
        return 0;
    }

    @Override
    public GNode[] getVertices() {
        return new GNode[0];
    }

    @Override
    public int getNumberOfEdges() {
        return 0;
    }

    @Override
    public GEdge[] getEdges() {
        return new GEdge[0];
    }

    @Override
    public GEdge getEdge(GNode source, GNode destination) {
        return null;
    }

    @Override
    public int outDegree(GNode node) {
        return 0;
    }

    @Override
    public int inDegree(GNode node) {
        return 0;
    }

    @Override
    public GEdge[] outgoingEdges(GNode node) {
        return new GEdge[0];
    }

    @Override
    public GEdge[] incomingEdges(GNode node) {
        return new GEdge[0];
    }

    @Override
    public void addNode(GNode node) {

    }

    @Override
    public void addEdge(GNode source, GNode destination, int weight) {

    }

    @Override
    public void removeNode(GNode node) {

    }

    @Override
    public void removeEdge(GEdge edge) {

    }
}
