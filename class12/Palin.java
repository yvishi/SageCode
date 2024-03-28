package class12;
import java.util.Scanner;
class Palin
{
    int num, revnum; // data members
    public Palin()
    {
        num=0;
        revnum=0;
    }

    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        num=sc.nextInt();
    }

    public int reverse(int y)
    {
        if(y>0)
        {
            revnum=(revnum*10)+(y%10);
            return reverse(y/10);    
        }
        else
            return revnum;    
    }

    public void check()
    {
        if(reverse(num)==num)
            System.out.println("It is palindrome number");
        else
            System.out.println("It is not a palindrome number");
    }

    public static void main()
    {
        Palin obj=new Palin();
        obj.accept();
        obj.check();
    }
}

