//class --> class  = extends
//interface --> interface  = extends 
 //interface -->  class = implements

interface A {
    int age =21;     // in interface all variable are final and static we cabt change further we have to initialize all variable at starting we cant keep it as [int age;]
    String  area ="mumbai";
    void show ();  // actually this is public abstract void show 
    void config(); // in interface methods are deaultly  public abstract
}
interface B{
    void run();
} 
interface C extends B{
                          // in c interface having run method 
}
class X implements A,B {    // if its A,C eventhough we will have rum method bcz it extends 
    // we need to define all abstract methods 
      public void show (){
        System.out.println("in show ");
      }
       public void config(){
        System.out.println("in config");
      }
      public void run(){
        System.out.println("i am running");
    }
}




public class interfaceee {
    public static void main(String[] args) {
       
        A obj = new X();
         obj.show();
        System.out.println(A.age);
    }
}
  