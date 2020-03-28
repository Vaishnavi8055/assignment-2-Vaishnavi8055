/*
 *  Created by IntelliJ IDEA.
 *  User: Vaishnavi
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree myBinarySearchTree=new MyBinarySearchTree();
        TreeNode treeRoot=new TreeNode(45);
        myBinarySearchTree.insertNode(treeRoot,43);
        myBinarySearchTree.insertNode(treeRoot,54);
        myBinarySearchTree.insertNode(treeRoot,32);
        myBinarySearchTree.insertNode(treeRoot,34);
        myBinarySearchTree.insertNode(treeRoot,12);
        myBinarySearchTree.insertNode(treeRoot,10);
        myBinarySearchTree.insertNode(treeRoot,87);
        myBinarySearchTree.insertNode(treeRoot,56);

        myBinarySearchTree.countNodesWithoutLeftChild(treeRoot);

         myBinarySearchTree.leftNodesDisplay(treeRoot);
    }
}
