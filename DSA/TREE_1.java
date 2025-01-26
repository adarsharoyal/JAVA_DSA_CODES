package DSA;

import java.util.*;
/**
class binarytree{
    class Node{
          int data;
          Node left;
          Node right;
        public  Node(int data){
            this.data=data;
        }
    }
    Node root;
    public void insert(int data){
       
        
          root = insertrec(root,data);
        
    }
    public Node insertrec( Node root,int data){
        if(root==null){
            root=new Node(data);
            return root;
        }
     else  if(data<root.data){
          root.left=insertrec(root.left , data);
        }
        else if(data>root.data){
            root.right=insertrec(root.right , data);
        }
        return root;
    }

    public void inorder(){
           inorderrec(root);
    }
    public void inorderrec(Node root){
        
       if(root!=null){
        inorderrec(root.left);
        System.out.print(root.data+" ");
        inorderrec(root.right);
       }

    }
}




public class TREE_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          binarytree tre = new binarytree();
          tre.insert(5);
          tre.insert(3);
          tre.insert(4);
          tre.insert(9);
          tre.insert(1);
          tre.insert(7);
          tre.insert(6);
          tre.inorder();

    }
}






 */

// again 
 class binarytree{
    class Node{
        Node left;
        Node right;
        int data;
        Node(int data){
            this.data=data;
        }
    }
    Node root;
    public void insert(int data){
      root = insertrec(root, data);
    }
    public  Node insertrec(Node root ,int data){
         if(root==null){
            root=new Node(data);
            return root;
         }
         else if (data<root.data){
            root.left=insertrec(root.left,data);
         }
         else if (data>root.data){
              root.right=insertrec(root.right,data);
         }
        return root;
     }
     public void inorder(){
        inorderrec( root);
     }
     public void inorderrec(Node root){
        if(root!=null){
            inorderrec(root.left);
            System.out.print(root.data);
            inorderrec(root.right);
        }
     }
 }



public class TREE_1{
    public static void main(String[] args) {
        binarytree tre = new binarytree();
        
        tre.insert(5);
          tre.insert(3);
          tre.insert(4);
          tre.insert(9);
          tre.insert(1);
          tre.insert(7);
          tre.insert(6);
          tre.insert(2);
          tre.inorder();

    }
}
