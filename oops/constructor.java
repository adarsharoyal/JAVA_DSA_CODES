class human{
    String name ="ads";
    int age=12;
    // constructor is amethod with same name as classs with out any return type
    public   human(){
        System.out.println(age+ " "+name );
    }
    public  human(int num){  //parametrized constructor
        System.out.println(age+ " "+name );
    }
}
public class constructor{
    public static void main(String[] args) {
        human obj =new human(1);
    }
}