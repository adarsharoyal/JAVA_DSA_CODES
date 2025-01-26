package DSA;
class main{
    int Queue[] = new int[5];
    int front=0;
    int rear=0;
    public void enqueue(int data){
       Queue[rear]=data;
       rear++;

    }
    public void dequeue(){
        Queue[front]=0;
        front++;
    }
    public void show(){
        for (int i : Queue){
            System.out.print(i+ " ");
        }
    }
}
public class queue_1 {
   
    public static void main(String[] args) {
      main obj = new main();
      obj.enqueue(2);
      obj.enqueue(22);
      obj.enqueue(222);
      obj.show();
      obj.dequeue();
      System.out.println();
      obj.show();
      obj.enqueue(23);
      System.out.println();
      obj.show();
      
    }
}
/*
2 22 222 0 0 
0 22 222 0 0
0 22 222 23 0
 */