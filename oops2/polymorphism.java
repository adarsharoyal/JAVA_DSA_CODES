class A {
    public void show(){
        System.out.println( " in A ");
    }
}
class B extends A {
    public void show(){
     System.out.println("in B ");
    }
}



public class polymorphism {
    public static void main(String[] args) {
        //  B obj = new B ();
          A obj = new B(); 
            obj.show();            //obj created in b with refer to a 
                                   // computer obj = new laptop(); latop is a computer right 


    }
}
