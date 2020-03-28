/*
 *  Created by IntelliJ IDEA.
 *  User: Vaishnavi
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.node;

import problem5.student.Student;

// to define node properties
public class Node {
    private Student student;
    private Node nextRef;

    public Node(Student student1) {
        this.student = student1;
        nextRef = null;
    }
}
