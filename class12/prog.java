package class12;
//import java.util.Scanner;
public class prog
{
    /*public static void main()
    {
        prog obj=new prog();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        double p=obj.findpower(n,m);
        System.out.print(p);
    }*/
    public double findpower(int x, int y)
    {
        if(y==0)
        return 1;
        else
        return 5*findpower(x,--y);
    }
}