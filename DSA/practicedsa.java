package DSA;
class Node {
   int data;
   Node next;
}
class linkedlist{
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

         while(n.next!=null){
            n=n.next;
         }
         n.next=node;
      }
   }
   
   public void insertatstart(int data){
      Node node = new Node();
      head=node;
      node.data= data;
      node.next=null;

   }
   public void insertat(int index, int data){
      if(index==0){
         insertatstart(data);
      }
      else{
         Node n =head;
         Node node= new Node();
         for(int i=0;i<index-1;i++){
               n=n.next;
         }
         n.next=node;
         node.next=n.next;
      }
      
   }
   public void printdata(){
      Node M =head;
      while(M.next!=null){
      System.out.println(M.data);}
      System.out.println(M.data);
   }
}




public class practicedsa{
   public static void main(String[] args) {
       linkedlist obj = new linkedlist();
       obj.insert(21);
       obj.insert(43);
      obj.printdata();   }
} 