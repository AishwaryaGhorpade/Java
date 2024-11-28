package Queue;
public class LLQueue {
static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
    static class Queue{
        static Node head=null;
        static Node tail=null;
        //isEmpty
        public static boolean isEmpty()
        {
            return head==null && tail==null;
        }

        //add
        public static void add(int data)
        {
            Node newNode=new Node(data);
            if(tail==null)   //if(isEmpty) //for first element inserting or when queue is empty
            {
                head=tail=newNode;
            }
            else{
            tail.next=newNode;
            tail=newNode;
            }      
        }
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("Queue Empty");
                return -1;
            }
            int front=head.data;
            if(head==tail)  //single element is there in queue
            {
                tail=null;
            }
            head=head.next;
            return front;
        }
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Queue Empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
