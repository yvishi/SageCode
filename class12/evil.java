package class12;

import java.util.Scanner;
class evil
{
    int num,bin;
    public evil()
    {
        num=bin=0;
    }
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        num=sc.nextInt();
    }
    public void rec(int x)
    {
        if(x==0)
        return;
        else
        {
            bin=bin*10+(x%2);
            rec(x/2);
        }
    }
    public void check()
    {
        rec(num);
        int sum=0;
        while(bin!=0)
        {
            int n=bin%10;
            sum+=n;
            bin/=10;
        }
        if(sum%2==0)
        System.out.println("It is an evil number.");
        else
        System.out.println("It is not an evil number.");
    }
    public static void main()
    {
        evil obj=new evil();
        obj.accept();
        obj.check();
    }
}
        
        
        
            