package class12;

import java.util.Scanner;
class mix
{
    String wrd;
    int len;
    public mix()
    {
        this.len=0;this.wrd="";
    }

    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the word:");
        this.wrd=sc.next();
        this.len=this.wrd.length();
    }

    public void mix_word(mix p,mix q)
    {
        int lb=0;int ls=0;
        if(p.len>q.len)
        {lb=p.len; ls=q.len;}
        else
        {lb=q.len; ls=p.len;}
        for(int i=0;i<lb;++i)
        {
            while(i<ls)
            {
                this.wrd+=p.wrd.charAt(i)+q.wrd.charAt(i);
                ++i;
            }
            if(p.len>q.len)
                this.wrd+=p.wrd.charAt(i);
            else
                this.wrd+=q.wrd.charAt(i);

        }
    }

    public void display()
    {
        System.out.println("word is:"+this.wrd);
    }

    public static void main()
    {
        mix obj1=new mix();
        mix obj2=new mix();
        mix obj3=new mix();
        obj1.input();
        obj2.input();
        obj3.mix_word(obj1,obj2);
        obj3.display();
    }
}          