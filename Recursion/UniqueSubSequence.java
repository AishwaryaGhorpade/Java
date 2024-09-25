package Recursion;
import java.util.*;
public class UniqueSubSequence {
    public static void UniqueSubSequenceFun(String str,int i,String newStr,HashSet<String> set)
    {
        if(i==str.length())
        {
            if(set.contains(newStr))
            {
                return;
            }
            else{
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char curChar=str.charAt(i);
        //to be
        UniqueSubSequenceFun(str, i+1, newStr+curChar,set);
        //not to be
        UniqueSubSequenceFun(str, i+1, newStr,set);
    }
    public static void main(String[] args) {
        String str="aaa";
        HashSet<String> set=new HashSet<>();
        UniqueSubSequenceFun(str,0,"",set);

    }
}
