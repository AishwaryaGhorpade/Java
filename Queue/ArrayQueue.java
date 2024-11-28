package Queue;
public class ArrayQueue {
      static class Queue{
       static int arr[];
       static int size;
       static int rear=-1;
       static int front=0;
        Queue(int n)
        {
            arr=new int[n];
            this.size=n;
        }

        //isEmpty
        public static boolean isEmpty()
        {
            return rear==-1;
        }
        //enqueue -adding element  -O(1)
        public static void add(int data)
        {
            if(rear==size-1)
            {
                System.out.println("Queue full");
                return;
            }
            rear++;
            arr[rear]=data;
        }

        //dequeue- O(n)
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("queue Empty");
                return -1;
            }
            int frontEle=arr[front];
            for(int i=0;i<rear;i++)
            {
                arr[i]=arr[i+1];
            }
            rear--;
            return frontEle;
        }

        //peek -O(n)
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("queue Empty");
                return -1;
            }
            return arr[0];
        }
    }
  
    public static void main(String[] args) {
        Queue q=new Queue(10);
        q.add(10);
        q.add(20);
        q.add(30);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
        
    }
}