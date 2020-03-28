/*
 *  Created by IntelliJ IDEA.
 *  User: Vaishnavi
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.node.Node;
import problem5.student.Student;

import java.util.Scanner;

//executable class
public class MyMain {
    public static void main(String[] args) {
        MyCircularQueue myCircularQueue =new MyCircularQueue();
        Node node;

        for(int k=0;k<5;k++){
            node=new Node (new Student());
            myCircularQueue.enqueueNode(node);
        }

        myCircularQueue.displayQueue();

        myCircularQueue.remove(new Scanner(System.in).next());
        myCircularQueue.displayQueue();

        myCircularQueue.processing(new Scanner(System.in).next());


    }
}
