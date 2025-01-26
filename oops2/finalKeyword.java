final class calc {
     final int a=1;
     int a =2;// we cant change a value bcaz it fixed (final) 

    public final void show(){
       System.out.println("by ADARSHA");
    }
}
class advcalc extends calc{
    // we cant inherit the class calc bcz its final 
     public final void show(){
       System.out.println("by ads");
    }// we cant override 
}


public class finalKeyword {
    public static void main(String[] args) {
        
    }
}
