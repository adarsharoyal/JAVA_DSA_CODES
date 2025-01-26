
import java.util.*;

public class Arraylistt {
    public static void main(String[] args) {
       // Collection<Integer> nums = new ArrayList<Integer>();
        List<Integer> nums = new ArrayList<Integer>();
     nums.add(1);         // ^ here we can use the "collection" in place of "List"
     nums.add(21);        //if wewant indexing use "List"
     nums.add(11);          
     nums.add(12);
     nums.add(14);
     System.out.println(nums);
    
        for(int n : nums){
        System.out.print(n + " ");
        }
        System.out.println(nums.get(2) + " "); //indexing 
    }
}
