package Sorting;
import java.util.*;

public class bubblesort {
    public static void printArray(int[] arr, int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
     public static void bubblesortmethod(int[] arr,int n)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        printArray(arr,n);
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of array elements:");
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array Elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        bubblesortmethod(arr,n);

    }
}
