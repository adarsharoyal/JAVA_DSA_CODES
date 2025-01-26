
class calc{
    public  void add(int n1 ,int n2)
    {
        System.out.println(n1+n2);
    }
}
class advcalc extends calc{
   
    public void add(int n1 , int n2 )
    {
        System.out.println(n1+n2+1);
    }
}
public class Overriding {
    public static void main(String[] args) {
        advcalc obj1 = new advcalc();
        obj1.add(9,2);
      
    }
}
// method overriding means same method in
// differnt classs with different results 
