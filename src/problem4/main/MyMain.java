/*
 *  Created by IntelliJ IDEA.
 *  User: Vaishnavi
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;
import problem4.myqueue.MyQueue;

import java.util.Scanner;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyBinarySearchTree myBinarySearchTree = new MyBinarySearchTree();
        MyQueue queue = new MyQueue();

        TreeNode treeRoot = new TreeNode(32);
        myBinarySearchTree.insertNode(treeRoot,45);
        myBinarySearchTree.insertNode(treeRoot,12);
        myBinarySearchTree.insertNode(treeRoot,2);
        myBinarySearchTree.insertNode(treeRoot,3);
        myBinarySearchTree.insertNode(treeRoot,6);

        queue.preOrderTraverse(treeRoot);
        queue.displayQueue(queue);

        System.out.println("Enter an element of which you want a Successor :");
        queue.printPreOrderSuccessor(sc.nextInt());
    }
}
}
