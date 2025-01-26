package DSA;

import java.util.*;

public class Stack_1 {
    public static void main(String[] args) {
        Stack<Integer>  s = new Stack<Integer>();
        s.push(21);
        s.push(22);
        s.push(23);
        s.push(24);
        s.push(25);
        System.out.println(s);
        System.out.println(s.pop());
       System.out.println( s.peek());
    }
}
