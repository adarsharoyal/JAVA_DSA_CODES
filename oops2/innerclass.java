// class which is defined inside class is inner class
//inner will be static class.if it is static classs no need to create object
 //  if it inner class  is not static first vreate obj to outer and create inner 



class AA{
    int a;
    public void show(){
        System.out.println("in show");
    }
     static class inner{
        public void config(){
            System.out.println("in config");
        }
    }
}
public class innerclass {
    public static void main(String[] args) {
        AA obj = new AA();  // object for outer class
        obj.show();
         
       //AA.inner obj1= new  AA.inner();   // object for inner class if it is not static 
       // obj1.config();


       AA.inner obj1= new  AA.inner();   // object for inner class if it is  static 
        obj1.config();
        
    }
    
}
