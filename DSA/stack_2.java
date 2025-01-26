package DSA;

import java.util.Scanner;

class Sttack{
    int top=-1;
    public boolean isempty(int stack [] ){
      if(top<0) return true;
      return false;
    }
    public boolean isfull(int stack [] ){
          if(top>=stack.length-1) return true;
          return false;
    }
    public void push(int stack [] , int data){
        if(isfull(stack)) return;
          top++;
          stack[top]=data;
    }
    public void pop(int stack [] ){
        if(isempty(stack)) return;
        System.out.println("deleted ="+ stack[top]);
        top --;
    }
    public int peek(int stack [] ){
         if(isempty(stack)) return -1;
         else return stack[top];
    }
    public void show(int stack [] ){
         for(int i=top;i>=0;i--){
           System.out.print ( stack[i]+ " ");
         }
         System.out.println();
    }
}
public class stack_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sttack s= new Sttack();
        int n =sc.nextInt();
        int stack[]= new int[n];
        for(int i=0;i<n;i++)
        {
            s.push(stack , sc.nextInt());
        }
         s.show(stack);
         s.pop(stack);

         
    }
}