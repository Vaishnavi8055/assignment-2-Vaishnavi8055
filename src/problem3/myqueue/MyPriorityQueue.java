/*
 *  Created by IntelliJ IDEA.
 *  User: Vaishnavi
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.node.Node;

public class MyPriorityQueue {
    private Node front;
    private Node rear;

    public MyPriorityQueue(Node front, Node rear) {
        this.front = null;
        this.rear = null;
    }

    public boolean isEmpty(){
        return front==null;
    }
}
