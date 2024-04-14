package class12;

import java.util.Scanner;
class armnum
{
    int n,l;
    public armnum(int nn)
    {
        n=nn;
        l=String.valueOf(n).length();
    }

    public int sum_pow(int i)
    {
        if(i==0)
            return 0;
        else
            return (int)Math.pow((i%10),l) + sum_pow(i/10);     
    }

    public void isarms()
    {
        if(sum_pow(n)==n)
            System.out.println("Number is armstrong.");
        else
            System.out.println("Number is not armstrong.");
    }

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int nn=sc.nextInt();
        armnum obj=new armnum(nn);
        obj.isarms();
    }
}
 