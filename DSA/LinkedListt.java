package DSA;

import LinkedList;
import Node;

class Node {
    int data;
    Node next;
}

  class LinkedList{
   Node head;
   public void insert(int data){
      Node node = new Node();
      node.next=null;
      node.data=data;
      if(head==null){
          head=node;
      }
      else{
       Node n=head;
       while(n.next!=null){
        n=n.next;
       }
       n.next=node;
      }
   }
   public void show(){
    Node node =head;
    while (node.next!=null) {
        System.out.println( node.data);
        node=node.next;
        }
        System.out.println(node.data);
   }
}
public class LinkedListt{
    public static void main (String args[]){
      LinkedList list = new LinkedList();
      
      list.insert(10);
      list.insert(13);
      list.insert(15);
      list.insert(16);      
      list.show();
    }
}

