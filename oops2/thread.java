
class Ant extends Thread{
    public void run(){
       for (int i =0; i<10;i++ )
       System.out.println("hi");
       try{
       Thread.sleep(2);}
       catch(InterruptedException e){
                       System.out.println();
       }
    }
   
}

class Bet extends Thread {
   public void run() {
       for (int i = 0; i < 9; i++)
           System.out.println("hello");
            try{
       Thread.sleep(1);}
       catch(InterruptedException e){
                       System.out.println();
       }

   }
}



public class thread {
   public static void main(String[] args) {
      Ant  obj1 = new Ant();
      
      Bet obj2   = new Bet();
      
      obj1.start();
       
      obj2.start();


   
   }
}
