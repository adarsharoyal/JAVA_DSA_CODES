import java.util.*;
public class three_forloops {
    public static void main(String[] args) {
        //List<Integer> nums= new ArrayList<>();
        //nums.add(2);
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
         // to print all the values using for looosps
         for(int i=0 ; i<nums.size();i++){
            System.out.println(nums.get(i));
         }
          for (int n :nums){
            System.out.println(n);
          }
          
          nums.forEach(n -> System.out.println(n));

        

    }
}
