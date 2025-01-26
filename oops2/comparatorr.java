import java.util.*;


public class comparatorr {
    public static void main(String[] args) {
     Comparator<Integer> com = new Comparator<Integer>(){
         public int compare(Integer i , Integer j){
                if (i%10 > j%10)
                return 1;
                else 
                return -1;
         }
     };

    List<Integer> nums= new ArrayList<>();
    nums.add(25);
    nums.add(21);
    nums.add(23);
    nums.add(32);
    nums.add(54);

    Collections.sort(nums, com );

    System.out.println(nums);
        
    }
}
/**


import java.util.*;

class Students {
    int age  ;
    String name ;

public Students(int age, String name) {
        this.age = age;
        this.name = name;
    }
 public String toString(){
     return( "age = " +age +"  name = "+ name  );
 }
}

public class comparatorr {
    public static void main(String[] args) {
     Comparator<Students> com = new Comparator<Students>(){
         public int compare(Students i , Students j){
                if (i.age > j.age)
                return 1;
                else 
                return -1;
         }
     };

    List<Students> nums= new ArrayList<>();
    nums.add(new Students(72, "ADARSHA"));
    nums.add(new Students(8, "ADARSHA"));
    nums.add(new Students(19, "ADARSHA"));



   Collections.sort(nums, com );

    System.out.println(nums);
        
    }
}
*/