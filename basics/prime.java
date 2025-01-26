package basics;
import java.util.Scanner;

public class prime {
    
     public static void main (String args []){
     Scanner sc =new Scanner(System.in);
     int n =sc.nextInt();
       int a=0;
       if (n<=1)
          System.out.println("not a prime");
       else {
          for( int i=2; i<=Math.sqrt(n);i++){
               if(n%i==0)
                a=1;
          }
       }       
      if (a==0)
       System.out.println("yes");
      else
      System.out.println("not a prime"); 
     }}