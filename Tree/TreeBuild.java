package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeBuild {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }
   static class BinaryTree{
        static int idx=-1;
       static Node BTree(int[] ar){
            idx++;
            if(ar[idx]==-1){
                return null;
            }
            Node newnode=new Node(ar[idx]);
            newnode.left=BTree(ar);
            newnode.right=BTree(ar);

            return newnode;
        }

        static void preorder(Node root){
           if(root==null){
               return;
           }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
       static void inorder(Node root){
           if(root==null){
               return;
           }
           preorder(root.left);
           System.out.print(root.data+" ");

           preorder(root.right);
       }
       static void postorder(Node root){
           if(root==null){
               return;
           }
           preorder(root.left);
           preorder(root.right);
           System.out.print(root.data+" ");
       }

       public static void LevelOrder(Node root){
           if(root== null){
               return;
           }
           Queue<Node> qr=new LinkedList<>();
           qr.add(root);
           qr.add(null);

           while(!qr.isEmpty()){
               Node curr=qr.remove();
               if(curr==null){
                   System.out.println();
                   if(qr.isEmpty()){
                       break;
                   }
                   else{
                       qr.add(null);
                   }
               }
               else{
                   System.out.print(curr.data+" ");
                   if(curr.left!=null){
                       qr.add(curr.left);
                   }
                   if(curr.right!=null){
                       qr.add(curr.right);
                   }
               }
           }
       }
    }

    public static void main(String[] args) {
    int ar[]={1,2,3,-1,-1,-1,4,-1,-1};
    BinaryTree btw=new BinaryTree();
    Node root=btw.BTree(ar);
   btw.LevelOrder(root);

    }
}
