package Array;
import java.util.*;
public class TwoDArr {
    public static void main(String[] args) {
        //Syntax: int[][] name=new int[row][col]
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row number:");
        int row=sc.nextInt();
        System.out.println("enter column number:");
        int col=sc.nextInt();
        int[][] arr=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        //linear search in 2D
        // System.out.println("enter key: ");
        // int key=sc.nextInt();
        // for(int i=0;i<row;i++)
        // {
        //     for(int j=0;j<col;j++)
        //     {
        //         if(arr[i][j]==key){
        //             System.out.println(key+" found at index "+i+" "+j+" )");
        //         }
        //     }
        // }

        //transpose matrix
        System.out.println("Transpose Matrix is:");
        for(int j=0;j<col;j++)
        {
            for(int i=0;i<row;i++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
