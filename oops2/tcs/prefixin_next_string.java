package tcs;

// You are using GCC
// You are using GCC
import java.util.*;
public class prefixin_next_string  {
    public static void main (String Args[]){
        Scanner sc = new Scanner (System.in);
        String s ="iamneo" ;
        String t ="abcidfaiimon";
        int count=0;
        int ref =0;
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            boolean found =false;
            for(int j=ref;j<t.length();j++){
                if(ch==t.charAt(j) ){
                    count++;
                     ref =j+1;
                     found=true;
                    break;
                }
            }
            if(!found) break;  
        }
         
        System.out.print(count);
    }
}