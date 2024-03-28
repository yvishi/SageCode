package class12;

import java.util.Scanner;
class perfect
{
    int num;
    public perfect(int nn)
    {
        num=nn;
    }
    public int sum_of_factors(int i)
    { 
        if(i==0)
        return 0;
        
        if(num%i==0)
        return i+sum_of_factors(--i);
        else
        return sum_of_factors(--i);
    }
    public void check()
    {
        if((sum_of_factors(num)-num)==num)
        System.out.println("It is perfect.");
        else
        System.out.println("It is not perfect.");
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int nn=sc.nextInt();
        perfect obj=new perfect(nn);
        obj.check();
    }
}
        
        