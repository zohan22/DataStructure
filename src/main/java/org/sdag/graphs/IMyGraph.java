package org.sdag.graphs;

public interface IMyGraph {
    /**
     * Returns the number of vertices in the graph.
     *
     * @return The number of vertices in the graph.
     */
    int getNumberOfVertices();

    /**
     * Returns an array containing all the vertices in the graph.
     *
     * @return An array of GNode representing all the vertices in the graph.
     */
    GNode[] getVertices();

    /**
     * Returns the number of edges in the graph.
     *
     * @return The number of edges in the graph.
     */
    int getNumberOfEdges();

    /**
     * Returns an array containing all the edges in the graph.
     *
     * @return An array of GEdge representing all the edges in the graph.
     */
    GEdge[] getEdges();

    /**
     * Returns the edge between the specified source and destination vertices.
     *
     * @param source      The source vertex.
     * @param destination The destination vertex.
     * @return The GEdge between the source and destination vertices, or null if no such edge exists.
     */
    GEdge getEdge(GNode source, GNode destination);

    /**
     * Returns the out-degree of the specified vertex.
     *
     * @param node The vertex for which to calculate the out-degree.
     * @return The out-degree of the specified vertex.
     */
    int outDegree(GNode node);

    /**
     * Returns the in-degree of the specified vertex.
     *
     * @param node The vertex for which to calculate the in-degree.
     * @return The in-degree of the specified vertex.
     */
    int inDegree(GNode node);

    /**
     * Returns an array of outgoing edges from the specified vertex.
     *
     * @param node The vertex for which to retrieve outgoing edges.
     * @return An array of GEdge representing the outgoing edges from the specified vertex.
     */
    GEdge[] outgoingEdges(GNode node);

    /**
     * Returns an array of incoming edges to the specified vertex.
     *
     * @param node The vertex for which to retrieve incoming edges.
     * @return An array of GEdge representing the incoming edges to the specified vertex.
     */
    GEdge[] incomingEdges(GNode node);

    /**
     * Adds a new vertex to the graph.
     *
     * @param node The GNode to be added as a new vertex.
     */
    void addNode(GNode node);

    /**
     * Adds a new edge to the graph between the specified source and destination vertices with the given weight.
     *
     * @param source      The source vertex.
     * @param destination The destination vertex.
     * @param weight      The weight of the new edge.
     */
    void addEdge(GNode source, GNode destination, int weight);

    /**
     * Removes the specified vertex from the graph.
     *
     * @param node The GNode to be removed.
     */
    void removeNode(GNode node);

    /**
     * Removes the specified edge from the graph.
     *
     * @param edge The GEdge to be removed.
     */
    void removeEdge(GEdge edge);

    /**
     * Prints the contents of the graph, including vertices and edges.
     */
    void print();
}
