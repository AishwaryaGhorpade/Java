package Array;

public class SubArr {
    public static void subArrrFun(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            String str="";
            for(int j=i;j<n;j++)
            {
                str+=arr[j];
                System.out.println(str);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        subArrrFun(arr);
    }
}
