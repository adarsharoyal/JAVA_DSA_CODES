package tcs;

import java.util.*;
public class contigiouswindow {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
       
        String[] arr= s.split(" ");
        int n = arr.length;
       int array[]= new int[n];
       int k = sc.nextInt();
       for(int i =0;i<n;i++){
          
        array[i]= Integer.parseInt(arr[i]);
        
       }
          for(int i=0;i<=n-k;i++){
            int max =array[i];
            for(int j=1;j<k;j++){
              max=Math.max(array[j+i], max);
            }
            System.out.print(max+ " ");
          }
    }
}
