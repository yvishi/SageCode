package class12;

import java.util.Scanner;
class dudney
{
    int num;
    public dudney()
    {
        num=0;
    }
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        num=sc.nextInt();
    }
    public int sumDigits(int x)
    {
        if(x==0)
        return 0;
        else
        return (x%10)+sumDigits(x/10);
    }
    public void isdude()
    {
        if(Math.pow(sumDigits(num),3)==num)
        System.out.println("It is dudney number.");
        else 
        System.out.println("It is not a dudney number.");
    }
    public static void main()
    {
        dudney obj=new dudney();
        obj.input();
        obj.isdude();
    }
}