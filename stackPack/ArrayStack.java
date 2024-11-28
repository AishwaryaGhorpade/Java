package stackPack;
public class ArrayStack {
    static class stackClass{
    public static int size=10;
    public static int[] stack=new int[size];
    int top=-1;
    public void push(int data)
    {
        if(top==size-1)
        {
            System.out.println("Stack overflow..!");
        }
        else{
            top++;
            stack[top]=data;
        }
    }
    public void pop()
    {
        if(top==-1)
        {
            System.out.println("stack underflow.");
        }
        else{
            // int popItem=stack[top];
            top--;
            // System.out.println("poped element:"+popItem);
        }
    }
    public int peek()
    {
        if(top==-1)
        {
            System.out.println("stack underflow.");
        }
        return stack[top];
    }
    public boolean isEmpty()
    {
         if(top==-1)
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
