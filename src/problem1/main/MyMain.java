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


    }
}
