package DSA;

public class binary_search {
     
     public static int binarysearch(int arr[], int target){
       int left = 0;
       int right = arr.length-1;
       while (left<=right){
        int mid=left+(right-left)/2;
        if(arr[mid]==target){
        return mid;
       }
       else if(target<arr[mid]){
        right=mid-1;
       }      
       else {
        left=mid+1;
       }
    }
        return -1;
     }
 public static void main(String[] args) {
    int array []={1,2,3,4,5,6};
    int target =4;
    int result = binarysearch(array,target);
    if(result != -1)
    System.out.println(" resultant index is "+ result );
    else 
    System.out.println(" not in the list ");
 }

}
