package Array;
import java.util.*;
public class Array {
    public static void main(String[] args) {
        /*Array Syntax
        type[] arr_name=new type[size];
        Ex:int[] arr=new int[3];  or
        int arr[]=new int[3]; or
        int arr[]={1,2,3};*/

        /*Scanner sc=new Scanner(System.in);
        System.out.println("enter Array Size:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter Array Elements:");
        for(int i=0;i<size;i++)
        {
         arr[i]=sc.nextInt();   
        }
        System.out.println("Array Elements are:");
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        } */

        //linear search
        int arr[]={1,2,3,4,5,6,7,8,9,0};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter key :");
        int key=sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                System.out.println(key+" found at index: "+i);
            }
        }



    }
    
}
