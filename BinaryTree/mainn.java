package BinaryTree;

public class mainn {
    public static void main(String[] args) {
        int ar[]={4,32,1,-1,-1,5,-1,-1,3,-1,1,54,6,7,8,-1,-1,-1,-1,5,5,-1,-1,-1,-1};
        BinaryT tr= new BinaryT();
       BinaryT.node root= tr.insertt(ar);
        tr.preorder(root);
//        tr.inorder(root);
    }
}
