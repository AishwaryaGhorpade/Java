package Recursion;

public class MoveAllX {
    public static void MoveAllXFun(String str,int i,int count,String newString)
    {
        if(i==str.length())
        {
            for(int k=0;k<count;k++)
            {
                newString+='x';
            }
            System.out.println(newString);
            return;
        }
        char curChar=str.charAt(i);
        if(curChar=='x')
        {
            count++;
            MoveAllXFun(str,i+1,count,newString);
        }
        else{
            newString+=curChar;
            MoveAllXFun(str,i+1,count,newString);
        }
    }
    public static void main(String[] args) {
        String str="axbxcxd";
        MoveAllXFun(str,0,0,"");
    }
}
