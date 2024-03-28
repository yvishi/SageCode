package class12;

import java.util.Scanner;
class rear
{
    String wrd,newwrd;
    public rear()
    {
        wrd=newwrd="";
    }
    public void readword()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the word in uppercase:");
        wrd=sc.next();
    }
    public void freq_vow_con()
    {
        int v=0;
        int c=0;
        int l=wrd.length();
        for(int i=0;i<l;++i)
        {
            char ch=wrd.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            ++v;
            else
            ++c;
        }
        System.out.println("Frequency of vowels:"+v+"\nFrequency of consonants:"+c);
    }
    public void arrange()
    {
        int l=wrd.length();
        for(int i=0;i<l;++i)
        {
            char ch=wrd.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            newwrd+=ch;
        }
        for(int i=0;i<l;++i)
        {
            char ch=wrd.charAt(i);
            if(ch!='A'&&ch!='E'&&ch!='I'&&ch!='O'&&ch!='U')
            newwrd+=ch;
        }
    }
    public void display()
    {
        System.out.println("Orignal word:"+wrd);
        System.out.println("New Word:"+newwrd);
    }
    public static void main()
    {
        rear obj=new rear();
        obj.readword();
        obj.freq_vow_con();
        obj.display();
    }
}
        