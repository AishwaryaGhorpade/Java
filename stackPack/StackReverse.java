package stackPack;
import java.util.*;
public class StackReverse {
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
    public static void reverse(Stack<Integer> stack){
        if(stack.isEmpty())
        {
            return;
        }
        int top=stack.pop();
        reverse(stack);
        AddAtBottom(top,stack);
    }
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        reverse(stack);
        while(!stack.isEmpty())
        {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
