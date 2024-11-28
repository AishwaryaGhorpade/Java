package Frameworks;
import java.util.*;
public class LList {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("is");
        list.addLast("list");
        list.addFirst("this");
        System.out.println(list);
        list.add(3,"?");
        System.out.println(list);
        System.out.println("length="+list.size());
        list.remove();
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
    }
}
