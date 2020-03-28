/*
 *  Created by IntelliJ IDEA.
 *  User: Vaishnavi
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;

import problem5.node.Node;

//to implement circular queue
public class MyCircularQueue {
    private Node frontNode;
    private Node endNode;
    private Node currentNode;

    public MyCircularQueue() {
        frontNode = null;
        endNode = null;
        currentNode = null;
    }

    public Node getFrontNode() {
        return frontNode;
    }

    public void setFrontNode(Node frontNode) {
        this.frontNode = frontNode;
    }

    public Node getEndNode() {
        return endNode;
    }

    public void setEndNode(Node endNode) {
        this.endNode = endNode;
    }

    public Node getCurrentNode() {
        return currentNode;
    }

    public void setCurrentNode(Node currentNode) {
        this.currentNode = currentNode;
    }

    public void enqueueNode(Node new_Node) {
        if (frontNode == null) {
            currentNode = frontNode = new_Node;
            return;
        }
        if (currentNode.getNextRef() == null) {
            currentNode.setNextRef(new_Node);
            new_Node.setNextRef(currentNode);
            endNode = new_Node;
            return;
        }
        new_Node.setNextRef(currentNode.getNextRef());
        currentNode.setNextRef(new_Node);
    }

    public void displayQueue() {
        currentNode = frontNode;
        try {
            do {
                System.out.println(currentNode.getStudent().toString());
                currentNode = currentNode.getNextRef();
            }
            while (currentNode != frontNode && currentNode != null);
        } catch (NullPointerException ignored) {
        }
    }

    public void processing(String name) {
        currentNode = frontNode;
        if (currentNode.getStudent().getStudentName().equals(name)) {
            System.out.println(currentNode.getStudent().toString());
            System.out.println(currentNode.getStudent().getStudentTotalBackLogs() - currentNode.getStudent().getStudentApperingCount());
        }
        while (!currentNode.getNextRef().getStudent().getStudentName().equals(name)) {
            currentNode = currentNode.getNextRef();
            if (currentNode == frontNode) {
                return;
            }
            System.out.println(currentNode.getStudent().toString());
            System.out.println(currentNode.getStudent().getStudentTotalBackLogs() - currentNode.getStudent().getStudentApperingCount());
        }
    }

    public void remove(String name) {
        currentNode = frontNode;
        if (currentNode.getStudent().equals(name) && currentNode.getStudent().getStudentTotalBackLogs() == 0) {
            currentNode = frontNode = frontNode.getNextRef();
        }
        while (!currentNode.getNextRef().getStudent().getStudentName().equals(name)) {
            currentNode = currentNode.getNextRef();
            if (currentNode == frontNode)
                return;
        }
        if (currentNode.getStudent().getStudentTotalBackLogs() == 0) {
            currentNode.setNextRef(currentNode.getNextRef().getNextRef());
        }
    }
}