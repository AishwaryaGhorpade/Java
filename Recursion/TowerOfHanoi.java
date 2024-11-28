package Recursion;
public class TowerOfHanoi {
    public static void TowerOfHanoiFun(int n,String src,String help,String dest)
{
    if(n==1)
    {
        System.out.println(n+" Disk Transfer from "+src+" to "+dest);
        return;
    }
    TowerOfHanoiFun(n-1,src,dest,help);
    System.out.println(n+" Disk Transfer from "+src+" to "+dest);
    TowerOfHanoiFun(n-1,help,src,dest);

}
    public static void main(String[] args) {
        int n=4;
        TowerOfHanoiFun(n,"S","H","D");
    }
}
