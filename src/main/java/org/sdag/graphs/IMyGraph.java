package org.sdag.graphs;

public interface IMyGraph {
    int getNumberOfVertices();
    GNode[] getVertices();
    int getNumberOfEdges();
    GEdge[] getEdges();
    GEdge getEdge(GNode source, GNode destination);
    int outDegree(GNode node);
    int inDegree(GNode node);
    GEdge[] outgoingEdges(GNode node);
    GEdge[] incomingEdges(GNode node);
    void addNode(GNode node);
    void addEdge(GNode source, GNode destination, int weight);
    void removeNode(GNode node);
    void removeEdge(GEdge edge);
}
