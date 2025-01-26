public class palindromme {
    public static void main(String[] args) {
        String s= "121212143";
        int n =s.length();
        for(int i=0;i<n/2;i++){
          if(s.charAt(i) != s.charAt(n-i-1)){
            System.out.println("not");
            return ;
          }
        }
        System.out.println("yes");
    }
}
