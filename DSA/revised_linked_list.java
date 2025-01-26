package DSA;

public class revised_linked_list {
    
}

class MyLinkedList {
    class Node {
        int data;
        Node next;
       
    }
   Node head;
   
    
    public int get(int index) {
       if(head==null)return -1;
        Node n = head;
         
           for(int i=0;i<index;i++){
            if(n==null)return -1;
            n=n.next;
           }
           return (n!=null) ? n.data  : -1;
         

    }
    
    public void addAtHead(int val) {
        Node node = new Node();
        node.data=val;
        node.next=head;
        head=node;
    }
    
    public void addAtTail(int val) {
        
        Node node = new Node();
        node.data=val;
        node.next=null;
        if(head==null) {
            head=node;
            return;
        }
        Node n = head;
        while(n.next!=null){
            n =n.next;
        }
        n.next=node;
    }
    
    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
            return;
        }
        Node node = new Node();
        node.data=val;
        node.next=null;       // 1 2 3 _ 4 5 6 7
        Node n = head;
        for(int i=0;i<index-1;i++){
            if(n==null)return;
           n=n.next;
        }
        if(n==null)return;
        node.next=n.next;
        n.next=node;
    }
    
    public void deleteAtIndex(int index) {
        Node n = head;
        if(index==0){
            head=head.next;
            return;
        }
       for( int i=0;i<index-1;i++){
        if(n==null || n.next==null)return;
        n=n.next;
       }
       if(n.next==null)return;
        n.next=n.next.next;   
    }
}

// adarsbsdnma d  anfnans,db,a 

class linkedllist{
    class Node {
        int data;
        Node next;
    }
    Node head;
    public int get(int index){
      if(head==null)return -1;
        
        Node n = head;
        for(int i=0;i<index;i++){
            if(n==null) return -1;
            n=n.next;
        }
        return (n!=null) ? n.data : -1 ;
    }
    public void AddAtStart(int data){
         Node node = new Node();
         node.data=data;
         node.next=null;
         if(head==null){
           head=  node;
             return;
         }
         node.next=head;
         head=node;

    }
    public void atindex(int index,int data){
        Node node =new Node();
        node.data=data;
        node.next=null;
        if(index==0){
            AddAtStart( data);
            return;
        }
        Node n = head;
        for(int i=0;i<index-1;i++){
            if(n==null) return;
            n=n.next;
        }
        if(n==null)return;
        node.next=n.next;
        n.next=node;
    }
    public void delete(int index){
        if(head==null)return;
        Node n =head;
        if(index==0){
            head=head.next;
            return;
        }
        for(int i=0;i<index-1;i++){
            if(n==null||n.next==null)return;
            n=n.next;
        }
        if(n.next==null)return;
        n.next=n.next.next;
    }
    public void addatTail(int data){
        Node node = new Node();
        node.data=data;
        node.next=null;
        if(head==null){
            head=node;
            return;
        }
        Node n =head;
        while(n.next!=null){
            
            n=n.next;
        }
        n.next=node;
    }

}**/

//          REVERSE OF A LINKED LIST K NUMBERS                */

public void printreverse (Node node){
    while (node!=null){
        System.out.print(node.data);
        node=node.next;
    }
}
public void showreverse(int k){
    if(k==0){
        printreverse(head);
        return;
    }
    while (true){
        Node prev=null;
        Node curr=head;
        int i=1;
        while(i<=k && curr!=null){
         Node next = curr.next;
          curr.next=prev;
          prev=curr;
          curr=next;
          i++;
        }
        printreverse(prev);
        if(curr==null)return;
        head=curr;
    }
}



























**/
