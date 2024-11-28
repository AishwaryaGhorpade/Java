package Sorting;
import java.util.*;

public class selectionSort {
    public static void printArray(int[] arr, int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
     public static void selectionSortmethod(int[] arr,int n)
    {
        for(int i=0;i<n-1;i++)
        {
            int minIndex=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[minIndex]>arr[j])
                {
                    minIndex=j;
                }
            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
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
        selectionSortmethod(arr,n);

    }
}
