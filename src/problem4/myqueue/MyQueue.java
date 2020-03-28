/*
 *  Created by IntelliJ IDEA.
 *  User: Vaishnavi
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor


import problem1.node.TreeNode;
import problem4.Node.Node;

public class MyQueue {
   private Node front;
   private Node end;
   private Node current;
   private int size;

    public MyQueue() {
        this.front = null;
        this.end = end;
        this.current = null;
        this.size = 0;
    }

    public Node getFront() {
        return front;
    }

    public void setFront(Node front) {
        this.front = front;
    }

    public Node getEnd() {
        return end;
    }

    public void setEnd(Node end) {
        this.end = end;
    }

    public Node getCurrent() {
        return current;
    }

    public void setCurrent(Node current) {
        this.current = current;
    }

    public int getSize(MyQueue queue) {
        queue.current=queue.front;

    }

    public void setSize(int size) {
        this.size = size;
    }
}
