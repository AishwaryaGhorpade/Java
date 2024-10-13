<<<<<<< HEAD
package LLPackage;

public class LL {
    Node head;
    private int count;
    LL(){
        this.count=0;
    }
    class Node{
        String data;
        Node next;
        Node(String data)
        {
            this.data=data;
            this.next=null;
            count++;
        }
    }

    //add First
    public void addFirst(String data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    //add-Last
    public void addLast(String data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null)
        {
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }

    //delete First
    public void delFirst()
    {
        if(head==null)
        {
            System.out.println("List is Empty");
        }
        count--;
        head=head.next;
    }

    //delete Last
    public void delLast(){
        if(head==null)
        {
            System.out.println("List is Empty");
        }
        count--;
        if(head.next==null)
        {
            head=null;
            return;
        }
        Node secLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null)
        {
            lastNode=lastNode.next;
            secLast=secLast.next;
        }
        secLast.next=null;
    }
     public int size()
     {
       return count;
     }

    public void printlist(){
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        Node curNode=head;
        while(curNode!=null)
        {
            System.out.print(curNode.data+"->");
            curNode=curNode.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LL list=new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printlist();
        list.addLast("list");
        list.printlist();
        list.addFirst("This");
        list.printlist();
        list.delFirst();
        list.printlist();
        list.delLast();
        list.printlist();
        System.out.println(list.size());
    }
}
=======
package LLPackage;

public class LL {
    Node head;
    private int count;
    LL(){
        this.count=0;
    }
    class Node{
        String data;
        Node next;
        Node(String data)
        {
            this.data=data;
            this.next=null;
            count++;
        }
    }

    //add First
    public void addFirst(String data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    //add-Last
    public void addLast(String data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null)
        {
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }

    //delete First
    public void delFirst()
    {
        if(head==null)
        {
            System.out.println("List is Empty");
        }
        count--;
        head=head.next;
    }

    //delete Last
    public void delLast(){
        if(head==null)
        {
            System.out.println("List is Empty");
        }
        count--;
        if(head.next==null)
        {
            head=null;
            return;
        }
        Node secLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null)
        {
            lastNode=lastNode.next;
            secLast=secLast.next;
        }
        secLast.next=null;
    }
     public int size()
     {
       return count;
     }

    public void printlist(){
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        Node curNode=head;
        while(curNode!=null)
        {
            System.out.print(curNode.data+"->");
            curNode=curNode.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LL list=new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printlist();
        list.addLast("list");
        list.printlist();
        list.addFirst("This");
        list.printlist();
        list.delFirst();
        list.printlist();
        list.delLast();
        list.printlist();
        System.out.println(list.size());
    }
}
>>>>>>> 393f2fc5eb560fdb1bfbb6240f94f8df9a1434de
