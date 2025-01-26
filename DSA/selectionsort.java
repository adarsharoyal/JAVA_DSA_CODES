package DSA;

public class selectionsort {
 
  public static void main(String[] args) {
    int array[]= {12,1,3,2,5};
    int minindex;
    int temp=0;
    
     for(int i=0; i<array.length;i++){
         minindex=i;
      for(int j=i+1;j<array.length;j++){
       if(array[minindex]>array[j])
       minindex =j;
     }
        temp =array[i];
       array[i]=array[minindex];
       array[minindex]=temp;

       for(int num : array){
        System.out.print(num +" ");
       
       } 
       System.out.println();
    }

    } 

     
}
