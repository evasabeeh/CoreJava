import java.util.*;
public class StackClass {
    
    public static void main(String[] args){
        Stack<Integer> s=new Stack<>();             //help of collection framework
        s.push(1);
        s.push(4);
        s.push(7);
        s.push(9);
        System.out.println(s.peek());         //top value of stack
        while(!s.isEmpty()){                 //till stack is not empty
            System.out.println(s.pop());
        }
    }
}
