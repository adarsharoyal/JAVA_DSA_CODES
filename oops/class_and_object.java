
 class method {
    public int  add(int a, int b){
       //System.out.println(a + b);
        return a+b;
    }
    
}
public class class_and_object {
    public static void main (String args[]){
           method obj=new method();

          int  str= obj.add(1,2);

           System.out.println(str);

    }
}