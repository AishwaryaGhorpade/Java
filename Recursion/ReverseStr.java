package Recursion;
public class ReverseStr {
    public static void ReverseStrFun(String str,int i)
    {
        if(i<0)
        {
            return;
        }
        System.out.print(str.charAt(i));
        ReverseStrFun(str,i-1);
    }
    public static void main(String[] args) {
        String str="hello";
        int n=str.length();
        ReverseStrFun(str,n-1);
        
    }
}
