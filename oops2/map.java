import java.util.*;
public class map {
    public static void main(String[] args) {
        Map<String, Integer> students= new HashMap<>(); //here we can use hashtable also
          students.put("adarsha",31);         // Hashtable is more prefer than hashmap
          students.put("ram",23);
          students.put("rama",31);
          students.put("dev",24);
          
          students.
         System.out.println(students);
        for(String key : students.keySet()){
            System.out.println(key + ":" + students.get(key));
        }

    }
    
}
if(!hm.containsKey(B.charAt(i))){