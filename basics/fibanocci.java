package basics;
import java .util.*;
public class fibanocci {
  public static void main (String args []){
     Scanner sc =new Scanner(System.in);
     int n =sc.nextInt();
     int f=0;
     int s=1;
if(n<=0) System.out.print(0);
       for(int i=1;i<=n;++i){
        System.out.println(f);
         int ne=f+s;
         f=s;
         s=ne;
       }
       sc.close();

    }
}
