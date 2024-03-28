package class12;

import java.util.Scanner;
class norepeat
{
    String wrd;
    int len;
    public norepeat(String wd)
    {
        wrd=wd.toUpperCase();
        len=wrd.length();
    }

    public boolean check()
    {
        for(int i=0;i<len-1;++i)
        {
            char ch=wrd.charAt(i);
            for(int j=i+1;j<len;++j)
            {
                if(ch==wrd.charAt(j))
                return false;
            }
        }
        return true;
    }
    public void display()
    {
        System.out.println("The word is:"+wrd);
        if(check()==false)
        System.out.println("It has a repeated letter.");
        else
        System.out.println("It does not have a repeated letter.");
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the word:");
        String wd=sc.next();
        norepeat obj=new norepeat(wd);
        obj.display();
    }
}

            
