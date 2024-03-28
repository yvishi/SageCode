package class12;
import java.util.Scanner;
class emirp
{
    int n,rev,f;
    public emirp(int nn)
    {
        n=nn;rev=0;f=2;
    }
    public int isprime(int x)
    {
        if(f==x)
        return 1;
        
        if(x%f==0)
        return 0;
        
        else
        {
            ++f;
            return isprime(x);
        }
    }
    public void isemirp()
    {
        int num=n;
        while(num!=0)
        {
            int d=num%10;
            rev=rev*10+d;
            num/=10;
        }
        if(isprime(n)==1 && isprime(rev)==1)
        System.out.println("It is an Emirp number");
        else
        System.out.println("It is not an Emirp number");
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int nn=sc.nextInt();
        emirp obj=new emirp(nn);
        obj.isemirp();
    }
}
        