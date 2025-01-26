package DSA;

public class Bubbleeort {
    public static void bubblesort(int array[]){
       for(int j=0;j<array.length;j++){
        for(int i=0;i<array.length-1;i++){
            if (array[i]>array[i+1])
             swap( array, i, i+1);

        }}
        System.out.print(" sorted array :");
        for(int num : array){
            System.out.print(  num +" ");
           }
    }
    public static void  swap (int array [],int k , int j){
        int temp = array[k];
        array[k] = array[j] ;
        array[j] = temp;
       
    }
    public static void main (String args[]){
        int arr[]={2,1,5,6,3,0};
        bubblesort(arr);
    }
}
