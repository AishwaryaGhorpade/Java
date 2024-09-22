//find the first and last occurence of character in string
package Recursion;
public class FirstLastOcc {
    public static int first=-1;
    public static int last=-1;
    public static void FirstLastOccFun(String str,int i,char ele)
    {
        if(i==str.length())
        {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char curChar=str.charAt(i);
        if(curChar==ele)
        {
            if(first==-1)
            {
                first=i;
            }
            else{
                last=i;
            }
        }
        FirstLastOccFun(str,i+1,ele);
    }
   public static void main(String[] args) {
    String str="hahbwdyaaakcnaagtak";
    FirstLastOccFun(str,0,'a');
   } 
}
