package org.sdag.graphs;

public class GNode {
    String nodeId;

    public GNode(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getNodeId() {
        return nodeId;
    }

    @Override
    public String toString() {
        return nodeId;
    }
}
