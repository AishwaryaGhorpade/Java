package Sorting;
import java.util.*;

public class insertionSort {
    public static void printArray(int[] arr, int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
     public static void insertionSortMethod(int[] arr,int n)
    {
        for(int i=1;i<n;i++)
        {
            int temp=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>temp) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
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
        insertionSortMethod(arr,n);

    }
}
