class human{
     private int age ;
    private String name ;
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
public class encapsulation{
    public static void main(String[] args) {
        human obj =new human();
        obj.setName( "name");
        obj.setAge(21);
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }

}