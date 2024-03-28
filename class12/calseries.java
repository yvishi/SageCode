package class12;

import java.util.Scanner;
class calseries
{
    int x,n,sum;
    public calseries()
    {
        x=n=sum=0;
    }

    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the values of x and n:");
        x=sc.nextInt();
        n=sc.nextInt();
    }

    public int power(int p,int q)
    {
        if(q==0)
            return 1;
        else
            return p*power(p,q-1);
    }

    public void cal()
    {
        for(int i=0;i<=n;++i)
            sum+=power(x,i);
        System.out.println("The sum of the series is:"+sum);
    }

    public static void main()
    {
        calseries obj=new calseries();
        obj.input();
        obj.cal();
    }
}

