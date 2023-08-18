package BinaryTree;

public class BinaryT {
    class node{
        int val;
        node left;
        node right;
        public node (int val){
            this.val=val;
            left=null;
            right=null;
        }
    }
    public node root;

    public node insert(node curr,int val){
        if (curr==null){
            return new node(val);
        }
        if(curr.val>val)
            curr.left=insert(curr.left,val);
        else if(curr.val<val)
            curr.right=insert(curr.right,val);
        else
            return curr;
        return curr;
    }
    public void add(int val){
        root=insert(root,val);
    }

        static int idx=-1;
        public node insertt(int ar[]){
            idx++;
            if(ar[idx]==-1){
                return null;
            }
            node ok=new node(ar[idx]);
            ok.left=insertt(ar);
            ok.right=insertt(ar);
            return ok;
        }
    public static void preorder(node root){
        if(root==null){
            return;
        }
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public void inorder(node root){
            if(root==null) return;
            inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }

}
