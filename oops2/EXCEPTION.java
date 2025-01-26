public class EXCEPTION {
    public static void main(String[] args) {
        
        int b=0;
        String s =null;
        int[] array= new int[4];

         try{
            System.out.println(array[0]);
        System.out.println(s.length());
        System.out.println(2/b);
         } 
         catch(ArithmeticException e){
            System.out.println(" not divide by 0");
         }
         catch(NullPointerException e){
            System.out.println("error");
         }
         catch(ArrayIndexOutOfBoundsException e){
            System.out.println("out of index");
         }
         catch(Exception e){
            System.out.println(e);
         }
    }
}  
