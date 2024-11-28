package Frameworks;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class ArrList {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        //add ele
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(list1);
        int ele=list1.get(0);
        System.out.println(ele);
        
        //add ele in b/w
        list1.add(1,6);
        System.out.println(list1);

        //set ele
        list1.set(0,5);
        System.out.println(list1);

        //remove ele
        list1.remove(2);
        System.out.println(list1);

        //size 
        int size=list1.size();
        System.out.println("length:"+size);

        for(int i=0;i<size;i++)
        {
            System.out.print(list1.get(i)+" ");
        }
        System.out.println();

        //sorting
        Collections.sort(list1);
        System.out.println(list1);
    }
}
