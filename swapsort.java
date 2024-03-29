package class12;
import java.util.Scanner;
class swapsort
{
    String wrd,swapwrd,sortwrd;
    int len;
    public swapsort()
    {
        len=0;
        wrd=swapwrd=sortwrd="";
    }

    public void readword()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the word:");
        wrd=sc.next();
    }

    public void swapchar()
    {
        len=wrd.length();
        swapwrd=wrd.charAt(len-1)+wrd.substring(1,len-1)+wrd.charAt(0);
    }

    public void sortword()
    {
        int a[]=new int[len];
        for(int i=0;i<len;++i)
            a[i]=(int)wrd.charAt(i);

        for(int i=0;i<len;++i)
        {
            for(int j=i+1;j<len;++j)
            {
                if(a[j]<a[i])
                {
                    int t=a[j];
                    a[j]=a[i];
                    a[i]=t;
                }
            }
        }

        for(int i=0;i<len;++i)
            sortwrd+=(char)a[i];

    }
    public void display()
    {
        System.out.println("word:"+wrd+"\nSwapped word:"+swapwrd+"\nSorted word:"+sortwrd);
    }

    public static void main()
    {
        swapsort obj=new swapsort();
        obj.readword();
        obj.swapchar();
        obj.sortword();
        obj.display();
    }
}

