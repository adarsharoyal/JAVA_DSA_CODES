package DSA;
import java.util.*;

public class Quicksort {
    public static void quicksort(int arr[],int low , int high){
         if(low < high){
            int pi = partition(arr,low ,high);
            quicksort(arr, low,pi-1);
            quicksort(arr,pi+1,high);
         }
    }
    public static void swap(int arr[], int k , int j){
        int temp=arr[k];
         arr[k]=arr[j];
         arr[j]=temp;
    }
    public static int partition(int[] arr, int low, int high){
         int pivot=arr[high];
         int i =low-1;
         for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
         }
         swap(arr,i+1,high);
         for(int num : arr){
            System.out.print( num + " ");
        }
        System.out.println();
       
         return i+1;
         
         
    }
     public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      
        int arr[]={5,4,3,2,1,6};
        
        quicksort(arr,0,arr.length-1);
        for(int num : arr){
            System.out.print( num + " ");
        }
     }
}
