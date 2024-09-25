package Recursion;
public class Permutation {
    public static void AllPosibleStr(String str,String Permutation)
    {
        if(str.length()==0)
        {
            System.out.println(Permutation);
        }
        for(int i=0;i<str.length();i++)
        {
            char curChar=str.charAt(i);
            String newStr=str.substring(0, i)+str.substring(i+1);
            AllPosibleStr(newStr,Permutation+curChar);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        AllPosibleStr(str,"");
    }
}
