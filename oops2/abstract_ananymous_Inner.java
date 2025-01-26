
 class A{
    public void show(){
         
}


public class abstract_ananymous_Inner {
    public static void main(String[] args) {
        A obj = new A()
        {
          public void show(){
         System.out.println("in  new show ");
          }
        };
          obj.show();
    }
 }} 
 // this is ananymous inner class 
 /**
abstract class A{
   public  abstract void show();
}


public class abstract_ananymous_Inner {
    public static void main(String[] args) {
        A obj = new A()
        {
          public void show(){
         System.out.println("in  new show ");
    }
        };
          obj.show();
    }
} // this is abstarct_ ananymous _inner class */

