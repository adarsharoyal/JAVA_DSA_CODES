package basics;
import java.util.*;
 

public class practice { 
 public static void main(String[] args) {
 Comparator<Integer> com =new Comparator<Integer > (){
  public int  compare(Integer i , Integer j){
     if(i%2 > j%2 )
         return 1;
     
     else
      return -1;
  }
    
  };
     List < Integer> nums= Arrays . asList(13,52,35,41,5);
      
    Collections.sort(nums);
    System.out.println(nums);
       
    

}

   
}
