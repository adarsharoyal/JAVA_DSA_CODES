package DSA;

public class Mergesort {
    public static void  mergesort(int arr[], int left, int right){
        if(left<right){
            int mid =(left+right)/2;
            mergesort(arr,left,mid);
            mergesort(arr,mid+1,right);

            merge(arr,left,mid,right);
        }
    }
    public static void merge(int []arr,int  left,int mid,int right){
           int n1 =mid-left+1;
           int n2 =right-mid;
           int larr[]=new int [n1];
           int rarr[]=new int [n2];
           for(int i=0; i<n1;i++){
              larr[i]=arr[left+i];
           }
           for(int j=0;j<n2;j++){
            rarr[j]=arr[mid+j+1];
           }
        int i=0;
        int j=0;
        int k=left;
        while (i<n1 && j<n2){
            if(larr[i]<=rarr[j]){
               arr[k]=larr[i];
               i++;
            }
            else {
                arr[k]=rarr[j];
                j++;
                
            }
            k++;
           
        }
        while (i<n1 ){
            
               arr[k]=larr[i];
               i++;
              k++;
            }
            while (j<n2 ){
            
                arr[k]=rarr[j];
                j++;
               k++;
             }
    }
    public static void main(String[] args) {
        int arr[]={5,3, 7 ,2 ,8,1};
        mergesort(arr,0,arr.length-1);
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
