/*
 *  Created by IntelliJ IDEA.
 *  User: Vaishnavi
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;
// to implement BinarySearchTree


import problem1.node.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MyBinarySearchTree {
   static Queue<TreeNode> queue;

   public TreeNode insertNode(TreeNode root,int data) {
       if (root == null) {
           return new TreeNode(data);
       } else if (data > root.getData()) {
           root.setRight(insertNode(root.getRight(), data));
       } else {
           root.setLeft(insertNode(root.getLeft(), data));
       }
       return root;
   }

   public void countNodesWithoutLeftChild(TreeNode root){
       if(root==null){
           return;
       }
       Queue<TreeNode> queues=new LinkedList<TreeNode>();

   }

}
