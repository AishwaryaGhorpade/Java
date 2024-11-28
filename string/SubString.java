package string;

public class SubString {
    public static void subStringFun(String str)
    {
        int n=str.length();
        for(int i=0;i<n;i++)
        {
            String s="";
            for(int j=i;j<n;j++)
            {
                s+=str.charAt(j);
                System.out.println(s);
            }
        }
    }
    public static void main(String[] args) {
        String str="aishu";
        subStringFun(str);
    }
}
