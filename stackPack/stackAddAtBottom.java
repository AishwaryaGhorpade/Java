package stackPack;

import java.util.*;
public class stackAddAtBottom {
    public static void AddAtBottom(int data,Stack<Integer> stack)
    {
        if(stack.isEmpty())
        {
            stack.push(data);
            return;
        }
        int top=stack.pop();
        AddAtBottom(data,stack);
        stack.push(top);    
    }
    
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        AddAtBottom(4, stack);
        while(!stack.isEmpty())
        {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
