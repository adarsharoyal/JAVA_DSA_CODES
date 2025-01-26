 class mobile{
  static  String name  ;
  int  price ;
  String brand ;

public  void method(){
    String name ="ads";
  System.out.println(price +" " + name +" "+ brand );
}
void car(){
name = "volvo";
System.out.println(name+price+"static method ");

}
}
public   class Statickey {
  public static void main(String[] args) {
      mobile obj = new mobile();
      obj.name="ads";
      obj.price=21;
      obj.brand="samsung";
     
      mobile obj1 =new mobile();
        obj1.name="kjkj";
      obj1.price=221;
      obj1.brand="dell";

      obj1.method();
      obj.method();
  }
  
}
// we will get same name as in both cases bez its static