package basics;
import java.util.*;
public class traingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =5;
        char ch ='A';
        for(int i=1;i<=n;i++){

            for(int j=i;j<=n;j++){
               System.out.print(" ");
             
           }
           for(int j=1;j<=i;j++){
            System.out.print(ch +" ");
          ch++;
        }
           
           System.out.println();
        }
        
    }
}

