package Recursion;

public class SubSequence {
    public static void SubSequenceFun(String str,int i,String newStr)
    {
        if(i==str.length())
        {
            System.out.println(newStr);
            return;
        }
        char curChar=str.charAt(i);
        //to be
        SubSequenceFun(str, i+1, newStr+curChar);
        //not to be
        SubSequenceFun(str, i+1, newStr);
    }
    public static void main(String[] args) {
        String str="abc";
        SubSequenceFun(str,0,"");
    }
}
