package DSA;
 
 class ads{
   class Node{
      int data;
      Node next;
    }
   Node head;
   public void insert(int data){
     
      Node node = new Node();
      node.data=data;
      node.next=null;
      if(head==null){
        head=node;
      }
      else{
         Node n =head;
        while (n.next!=null){
         n=n.next;
          
      }
      n.next=node;
      }

      
   }
   public void insertatstart(int data){
      Node node = new Node();
      node.data=data;
      node.next=head;
      head=node;
   }
   public void insertAt(int index, int data){
      Node node= new Node();
      node.data=data;
      node.next=null; 
      if(index==0){
         insertatstart(data);
      }          
    else {                      // insert at 0 index we have to do one more method
      Node n =head;
      
      for(int i=0;i<index-1;i++){
              n=n.next;
      }
      node.next=n.next;
      n.next=node;
    }
   }
   
public void delete(int index) {
        if (head == null) {
            return; // No elements to delete
        }

        Node n = head;
        if (index == 0) {
            head = head.next; // Remove the head node
            return;
        }

        int i = 0;
        // Traverse to the node just before the one we want to delete
        while (n != null && i < index - 1) {
            n = n.next;
            i++;
        }

        // If n is null or n.next is null, the index is out of bounds
        if (n == null || n.next == null) {
            return;
        }

        // Unlink the node to be deleted
        n.next = n.next.next;
    }

   public void show(){
      Node node=head;
        while(node.next!=null){
         System.out.print(node.data + " ");
         node=node.next;
        }
        System.out.print(node.data + " ");
   }
 }
 public class linkedlist2
 
 {
    public static void main(String[] args) {
       ads obj = new ads();
       obj.insert(2);
       obj.insert(3);
       obj.insert(2);
       obj.insert(32);
       obj.insertatstart(21);
       obj.insertAt(2,38);
       obj.insertAt(0,99);
       
       
       obj.show();
       obj.delete(3);
       System.out.println();
       
       obj.show();
    }
 }