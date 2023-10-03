package Tree;

public class Height {
   static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=left;
            this.right=right;
        }
        public static int heighted(Node root){
            if(root == null){return 0;}
            int lh=heighted(root.left );
            int rh=heighted(root.right);
            return  Math.max(lh,rh)+1;
        }
        static int count(Node root){
            if(root == null){
                return 0;
            }
            int left=count(root.left);
            int right=count(root.right);
            return left+right+1;
        }
        static int sum(Node root){
            if(root== null){
                return 0;
            }
            int lefs=sum(root.left);
            int reis=sum(root.right);
            return lefs+reis+root.data;
        }
    }


    public static void main(String[] args) {
       Node root=new Node(1);
       root.left=new Node(2);
       root.right=new Node(3);
       root.left.left=new Node(45);
        System.out.println(root.heighted(root));
        System.out.println(root.count(root));
        System.out.println(root.sum(root));
    }
}
