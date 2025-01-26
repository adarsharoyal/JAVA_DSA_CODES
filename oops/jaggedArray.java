


public class jaggedArray {
    public static void main(String[] args) {
        int array[][]=new int[3][];
        array[0]=new int[4];
        array[1]=new int[3];
        array[2]=new int[2];   
          for (int i=0;i<3;i++){
            for (int j=0;j<array[i].length;j++){
                array[i][j]=(int)(Math.random()*10);
                System.out.print(array[i][j] +" ");
            }
            System.out.println();
          }



    }
}
