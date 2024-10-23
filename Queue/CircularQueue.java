package Queue;
public class CircularQueue {
    static class Queue{
        static int arr[];
        static int front=-1;
        static int rear=-1;
        static int size;
        Queue(int n)
        {
            arr=new int[n];
            this.size=n;
        }
        public static boolean isFull()
        {
            return (rear+1)%size==front;
        }
        public static boolean isEmpty()
        {
            return front==-1 && rear==-1;
        }
        //enqueue 
        public static void add(int data)
        {
            if(isFull())
            {
                System.out.println("queue Full");
                return;
            }
            if(front==-1)
            {
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("Queue Empty");
                return -1;
            }
            int result=arr[front];
            if(rear==front)
            {
                rear=front=-1;
            }
            else{
                front=(front+1)%size;
            }
            return result;
        }
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Queue Empty");
                return -1;
            }
            int result=arr[front];
            return result;
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        System.out.println();
        q.add(6);
        System.out.println(q.remove());
        q.add(7);
        System.out.println();
        while (!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
