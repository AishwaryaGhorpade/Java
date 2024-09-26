//Find all posible ways in maze from (0,0) to (n,m)
package Recursion;

public class MatrixPaths {
    public static int AllPaths(int i,int j,int n,int m)
    {
        if(i==n || j==m)
        {
            return 0;
        }
        if(i==n-1 || j==m-1)
        {
            return 1;
        }
        //move down
        int downMoves=AllPaths(i+1,j,n,m);
        //move right
        int rightMoves=AllPaths(i,j+1,n,m);
        return downMoves+rightMoves;
    }
    public static void main(String[] args) {
        int n=3,m=3;
        System.out.println(AllPaths(0,0,n,m));
    }
}
