class Node{  
    Node pre;
    int data;
    Node next;
    Node(int data)
    {
        this.pre=null;
        this.data=data;
        this.next=null;
    }
}
class LL{
    Node head;
    Node tail;
    int size;
    LL()
    {
        this.size=0;
    }
    //add at First
    public void addFirst(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
            size++;
            return;
        }
        newNode.next=head;
        head.pre=newNode;
        head=newNode;
        size++;
    }
    //add at Last
    public void addLast(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
            size++;
            return;
        }
        tail.next=newNode;
        newNode.pre=tail;
        tail=newNode;
        size++;
    }
    //add at middle
    public void addMiddle(int data,int index)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
            size++;
            return;
        }
        if(index==0)
        {
            addFirst(data);
        }
        else if(size==index)
        {
            addLast(data);
        }
        Node curNode=head;
        for(int i=1;i<index;i++)
        {
            curNode=curNode.next;
        }
        Node curNode2=curNode.next;
        curNode.next=newNode;
        newNode.pre=curNode;
        newNode.next=curNode2;
        curNode2.pre=newNode;
        size++;
    }

    //delete First Node
    public int deleteFirst()
    {
        if(head==null)
        {
            System.out.println("List is Empty");
            return 0;
        }
        int deletedNode=head.data;
        head=head.next;
        head.pre=null;
        size--;
        return deletedNode;
    }

    //delete LastNode
    public int deleteLast()
    {
        if(head==null)
        {
            System.out.println("List is Empty");
            return 0;
        }
        int deletedNode=tail.data;
        tail=tail.pre;
        tail.next=null;
        size--;
        return deletedNode;
    }
    public void display()
    {
        if(head==null)
        {
            System.out.println("list is empty");
        }
        Node curNode=head;
        while(curNode!=null)
        {
            System.out.print(curNode.data+"->");
            curNode=curNode.next;
        }
        System.out.println();
    }
    public int size()
    {
        return size;
    }
    public void reverse()
    {
        Node curNode=tail;
        while (curNode!=null) {
            System.out.print(curNode.data+"->");
            curNode=curNode.pre;    
        }
        System.out.println();

    }
}
public class DLL {
public static void main(String[] args) {   
    LL list=new LL();
    list.display();
    list.addFirst(1);
    list.addFirst(2);
    list.addFirst(3);
    list.addFirst(4);
    list.addFirst(5);
    list.display();
    System.out.println(list.size());
    list.addLast(10);
    list.addLast(20);
    list.addLast(30);
    list.addLast(40);
    list.addLast(50);
    list.display();
    System.out.println(list.size());
    list.addMiddle(34, 4);
    list.display();
    System.out.println(list.size());
    list.deleteFirst();
    list.display();
    list.deleteLast();
    list.display();
    list.reverse();
}    
}
