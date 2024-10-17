package stackPack;
import java.util.*;
public class ArrayListStack {
    static ArrayList<Integer> stack=new ArrayList<>();
    static class stackClass{
    public void push(int data)
    {
        stack.add(data);
    }
    public void pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack underFlow");
        }
        else{
            stack.remove(stack.size()-1);
        }
    }
    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack underFlow");
        }
        int top=stack.size()-1;
        return stack.get(top);
    }
    public boolean isEmpty()
    {
        if(stack.size()==0)
        {
            return true;
        }
        return false;
    }
    }
    
    public static void main(String[] args) {
        stackClass stack=new stackClass();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        while(!stack.isEmpty())
        {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
