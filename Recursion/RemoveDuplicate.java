package Recursion;
public class RemoveDuplicate {
    public static boolean[] map=new boolean[26];
    public static void RemoveDuplicateFun(String str,int i,String newStr)
    {
        if(i==str.length())
        {
            System.out.println(newStr);
            return;
        }
        char curChar=str.charAt(i);
        if(map[curChar-'a']==true)
        {
            RemoveDuplicateFun(str,i+1,newStr);
        }
        else{
            newStr+=curChar;
            map[curChar-'a']=true;
            RemoveDuplicateFun(str,i+1,newStr);
        }
    }
    public static void main(String[] args) {
        String str="aabbccdd";
        RemoveDuplicateFun(str,0,"");
    }
}
