
class human{
  
private int age ;
   private String name ;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
public class gettersandsetters{
    public static void main(String[] args) {
        human obj =new human();
         obj.setAge(12);
         obj.setName("asa");
        System.out.println(obj.getAge()); 
        System.out.println( obj.getName());
        
    }

}