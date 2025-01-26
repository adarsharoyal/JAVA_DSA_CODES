package basics;
import java.util.*;

public class fact {
  public static void main (String args[]){
   Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();
    
   
    int i=1;

     while(a>0){
       i*=a;
     a--;

      }
      System.out.println(i);
      sc.close();
  }
 }


