/*
 *  Created by IntelliJ IDEA.
 *  User: Vaishnavi
 *  Date: 27-Mar-20
 *  Time: 12:00 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue myPriorityQueue=new MyPriorityQueue();
        myPriorityQueue.insertNode(55,3);
        myPriorityQueue.insertNode(36,1);
        myPriorityQueue.insertNode(76,4);
        myPriorityQueue.insertNode(98,6);
        myPriorityQueue.insertNode(78,5);
        myPriorityQueue.insertNode(45,2);

        myPriorityQueue.displayQueue();
    }
}
