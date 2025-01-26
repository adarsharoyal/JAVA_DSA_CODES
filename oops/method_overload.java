
 class overload {


    public void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void add(int a) {
        System.out.println(a);
    }
}

public class method_overload{
    public static void main(String args[]) {

        overload obj = new overload();
        obj.add(1,1,1);
    }
}
