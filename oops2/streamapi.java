import java.util.*;
public class streamapi {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3,4,5,52,28,1);
       
        int result = nums.stream()
                      .filter(n -> n%2==0)
                      .map(n ->n+1)
                      .reduce(0,(c,e)-> c+e);
    System.out.println(result);

       /*
       int sum=0;
       
       for( int n : nums){
            if (n %2 ==0){
              n=n+1;
            sum=sum+n;
        }
            
        }
        System.out.println( "final sum " + sum);*/
    }
}
