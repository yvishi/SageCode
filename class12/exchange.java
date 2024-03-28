package class12;

import java.util.*;
class exchange
{
    String sent,rev;
    int len;
    public exchange()
    {
        sent=rev="";
        len=0;
    }
    public void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the sentence:");
        sent=sc.nextLine();
        len=sent.length();
    }
    public void exfirstlast()
    {
        StringTokenizer st=new StringTokenizer(sent,". ");
        while(st.hasMoreTokens())
        {
            String s=st.nextToken();
            int l=s.length();
            if(l==1)
            rev+=s+" ";
            else
            rev+=s.charAt(l-1)+s.substring(1,l-1)+s.charAt(0)+" ";
        }
        rev=rev.trim();
        rev+=".";
    }
    public void display()
    {
        System.out.println("Orignal:"+sent);
        System.out.println("New:"+rev);
    }
    public static void main()
    {
        exchange obj=new exchange();
        obj.read();
        obj.exfirstlast();
        obj.display();
    }
}
    