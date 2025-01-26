 enum status{
       running, failed, pending , success;
}
public class Enum {
    public static void main(String[] args) {
       // status s =status.running;
       // System.out.println(s);
       status s =status.running;
       switch(s){
         case  running:{
            System.out.println(" all good");
            break;
         }
         case failed :{
            System.out.println("try again");
         }
         case  pending:{
            System.out.println(" wait");
         }
         default :{
            System.out.println(" done");
         }
       }
       
         
    }
}
