package DSA;

public class linearsearch {
    public static int  Linearsearch(int arr[], int target){
          for(int i =0; i<arr.length;i++){
             if(arr[i]==target){
                return i;
             }
          }
          return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5}  ;
          int target = 14;
         int result = Linearsearch(arr,target);
         if(result!=-1)
         System.out.println(" resultant index is "+ result );
         else 
         System.out.println(" not in the list ");
    }
}
