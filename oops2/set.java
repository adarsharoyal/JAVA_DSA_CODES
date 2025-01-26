
import java.util.*;

public class set {
    public static void main(String[] args) {
       // Collection<Integer> nums = new ArrayList<Integer>();
        Set<Integer> nums = new HashSet<Integer>();
    //   Set<Integer> nums = new TreeSet<Integer>();  
 //Treeset will print the sorted format 
     nums.add(1);        
     nums.add(21);        
     nums.add(11);          
     nums.add(12);
     nums.add(14);
    
        System.out.println(nums);
       // System.out.println(nums.get(2)); //indexing  not posiible  in sets 
    }
}
