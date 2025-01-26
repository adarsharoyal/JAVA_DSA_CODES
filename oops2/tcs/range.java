package tcs;
import java.util.*;
public class range {
    public static void main (String Args[]){
        Scanner sc = new Scanner (System.in);
        int s =sc.nextInt();
        int r =sc.nextInt();
        String s="adass asas ";
        String  array[]= s.split(" ");
        for(int i=0;i<s;i++){
            array[i]=sc.nextInt();
        }
        List<Integer> res = new ArrayList<>();
        for(int j=0;j<r;j++){
            int a =sc.nextInt();
            int b =sc.nextInt();
            int count=0;
            for(int i=0;i<array.length;i++){
                if(array[i] <= b && array[i]>=a){
                    count ++;
                }
              }
              res.add(count);
        }
        for(int i=0;i<res.size();i++){
            System.out.println(res.get(i));
        }
         
    }
}
