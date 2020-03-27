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

    public void insert(int data,int priority){
      Node node =new Node(data,priority);
       if(isEmpty()||node.getPriority()<front.getPriority()){
         node.setNext(front);
         front=node;
       }
       else{
           Node current=front;
           while(current.getNext()!=null && current.getNext().getPriority() <= node.getPriority()){
               current=current.getNext();
           }
           node.setNext(current.getNext());
           current.setNext(node);
       }
    }

    public void display(){

    }
}
