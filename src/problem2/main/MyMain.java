/*
 *  Created by IntelliJ IDEA.
 *  User: Vaishnavi
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;
// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree


import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;
import problem2.main.TraverseOperations.TraverseOperation;

public class MyMain {
    public static void main(String[] args) {

        TraverseOperation traverseOperation=new TraverseOperation();
        MyBinarySearchTree myBinarySearchTree=new MyBinarySearchTree();
        TreeNode treeNode=new TreeNode(37);
        myBinarySearchTree.insertNode(treeNode,4);
        myBinarySearchTree.insertNode(treeNode,2);
        myBinarySearchTree.insertNode(treeNode,5);
        myBinarySearchTree.insertNode(treeNode,7);


    }

}
