import java.util.*;
public class binaryTree {
    static class Node{
        int data;
        Node left=null;
        Node right=null;

        Node(int data){
            this.data=data;
        }
    }
    static class Tree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;          //a[idx];
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;
        }
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);
    }
    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data+" ");
    }
    public static void levelorder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);
        q.add(null);
        
        while(!q.isEmpty()){
            Node curr=q.remove();
            if(curr==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(curr.data+" ");
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
    }
    public static int countNodes(Node root){

        if(root==null){
            return 0;
        }
        int leftNodes=countNodes(root.left);
        int rightNodes=countNodes(root.right);

        return leftNodes+rightNodes+1;
    }
    public static int sumNodes(Node root){

        if(root==null){
            return 0;
        }
        int leftSum=sumNodes(root.left);
        int rightSum=sumNodes(root.right);

        return leftSum+rightSum+root.data;
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);

        int myHeight=Math.max(leftHeight,rightHeight)+1;

        return myHeight;
    }
    public static int diameter(Node root){             //O(n^2) -> ethod -1
        if(root==null){
            return 0;
        }
        int diam1=diameter(root.left);   //left subtree
        int diam2=diameter(root.right);   //left subtree
        int diam3=height(root.left)+height(root.right)+1;   //left subtree
        
        return Math.max(diam1, Math.max(diam2,diam3));
    }

    static class treeInfo{
        int ht;
        int diam;
        treeInfo(int ht, int diam){
            this.ht=ht;
            this.diam=diam;
        }
        public static treeInfo diameter2(Node root){      //O(n) -> method 2
   
            if(root==null){
                return new treeInfo(0,0);
            }
            treeInfo left=diameter2(root.left);
            treeInfo right=diameter2(root.right);

            int myHeight=Math.max(left.ht,right.ht)+1;

            int diam1=left.diam;
            int diam2=right.diam;
            int diam3=left.ht+right.ht+1;

            int myDiam=Math.max(diam1,Math.max(diam2, diam3));

            treeInfo myInfo=new treeInfo(myHeight, myDiam);
            return myInfo;
        }
    }
    public static void main(String[] args){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Tree t=new Tree();
        Node root=Tree.buildTree(nodes);
       System.out.println("building a tree "+root.data);
       System.out.println(diameter2(root).diam);
    }
}
