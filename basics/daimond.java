package basics;

// there are 2 code s in this page first one prints starswith outgap ..second prints with gap

public class daimond {
    public static void main(String[] args) {
        
     int n=9;
     for(int i=0;i<n/2+1;i++){
         for(int j=0;j<=n/2-i;j++){
            System.out.print(" ");

           }
          for(int k=0;k<(2*i)+1;k++){
           
            System.out.print("*");
          }
         System.out.println();
        }
        for (int a=1;a<=n/2;a++){
            for(int b=0;b<=a;b++){
                System.out.print(" ");
            }
            for(int c=0;c<n-2*a;c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/** import java.util.*;
class practice  {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc. nextInt();
     for (int i =0 ; i<n; i++){
        for(int k=1; k<n-i;k++){
                System.out.print(" ");
            }
        for(int j =0; j<=i;j++){
            
            System.out.print( "* ");
        }
        
        System.out.println();
     } 
     for (int i =0 ; i<n; i++){
        for(int k=n; k<=n+i;k++){
                System.out.print(" ");
            }
        for(int j =1; j<n-i;j++){
            
            System.out.print( "* ");
        }
        
        System.out.println();
     } 
        
    }
    
}

*/
