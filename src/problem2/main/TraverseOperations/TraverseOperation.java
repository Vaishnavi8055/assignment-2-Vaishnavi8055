package problem2.main.TraverseOperations;

import problem1.node.TreeNode;

public class TraverseOperation {

    public void displayPostOrderTraverse(TreeNode node){
       if(node==null) {
           return;
       }
           displayPostOrderTraverse(node.getLeft());
           displayPostOrderTraverse(node.getRight());
           System.out.println(node.getData()+" ");
    }

    public void displayPreOrderTraverse(TreeNode node){
       if(node==null){
           return;
       }
        System.out.println(node.getData()+" ");
        displayPreOrderTraverse(node.getLeft());
        displayPreOrderTraverse(node.getRight());
    }

}
