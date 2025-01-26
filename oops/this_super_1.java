

class a {
    public a(){
           super();
    System.out.println(" in a ");
  
    }
    public a(int num){
      this();
        System.out.println("in a int ");
          
    }
}
class b extends a {
    public b (){
        super(3); // here super(3) helps to excute parent class paramatroized constructor
        System.out.println("in b");
    }
    public b(int num ){
        this(); // this () helps to excute default constructor of same class
        System.out.println(" in b int ");
    }
}

public class this_super_1 {
    public static void main(String[] args) {
        b obj = new b (21);
    }
    
}
