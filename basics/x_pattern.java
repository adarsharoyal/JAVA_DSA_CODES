package basics;
public class x_pattern {
  public static void main(String[] args) {
    int rows =7;
    int spaces =5;
    int star =1;
    int fspace=0;
     for(int i=1; i<=rows;i++){
        for(int m=1;m<=fspace;m++){
            System.out.print(" ");
        } 
            System.out.print("*");
         
        for(int k=1; k<=spaces;k++){
            System.out.print(" ");
        }
         if(i<4)
        System.out.print("*");
         if(i>4)
         System.out.print("*");
        if ( i<=rows/2){
           fspace++;
           spaces -= 2;
           if(i==4){
            spaces++;
           }


        }
        else{
            fspace--;
            spaces += 2;
            if(i==5){
                spaces--;
            }
        }

System.out.println();

     }


  }
}
