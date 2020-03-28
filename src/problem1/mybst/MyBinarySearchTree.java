/*
 *  Created by IntelliJ IDEA.
 *  User: Vaishnavi
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;
// to implement BinarySearchTree


import com.sun.source.tree.Tree;
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
        queues.add(root);
        int count=0;
        while(queues !=null){
            TreeNode current=queues.poll();
            if (current==null){
                break;
            }
            if(current.getLeft()==null){
                count++;
            }
            if(current.getLeft()!=null){
                queues.add(current.getLeft());
            }
            if(current.getRight()!=null){
                queues.add(current.getRight());
            }
            System.out.println("Number of Nodes Without Left Child is :--"+count);
        }

   }

}
