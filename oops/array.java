public class array {
    public static void main(String[] args) {
       // int a[]={1,2,3,4};
       // a[1]=12;
       // System.out.println(a[1]);

       //int a[]=new int[5];
       //System.out.println(a[2]);//prints 0 

           // multi dimentional array
        int a[][]=new int[3][4];
        for (int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                a[i][j]=(int)(Math.random()*10);
                     System.out.print(a[i][j] + " ");
                
            }
            System.out.println();
        }



    }
}

