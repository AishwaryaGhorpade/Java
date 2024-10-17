package stackPack;
public class LLStack {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public void push(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
        }else{
            newNode.next=head;
        head=newNode;
        }  
    }
    public void pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack underFlow");
            return;
        }
        else{
            head=head.next;
        }
    }
    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack underFlow");
        }
        return head.data;
    }
    public boolean isEmpty()
    {
        return head==null;
    }
    public static void main(String[] args) {
        LLStack stack=new LLStack();
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
