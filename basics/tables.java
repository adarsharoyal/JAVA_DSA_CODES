package basics;
import java.util.Scanner;

public class tables {
     public static void main (String args []){
     Scanner sc =new Scanner(System.in);
     int n =sc.nextInt();
      
        for(int j=1;j<11;j++){
            System.out.println(n + " "+ "* "+j+"= "+ (n*j));
        }
      

     } 
}


