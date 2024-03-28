package class12;
import java.util.*;
class capital
{
    String sent;
    int freq;
    public capital()
    {
        sent="";
        freq=0;
    }
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the sentence:");
        sent=sc.nextLine();
    }
    public boolean isCap(String w)
    {
        if(w.charAt(0)>=65&&w.charAt(0)<=90)
        return true;
        else
        return false;
    }
    public void display()
    {
        StringTokenizer st=new StringTokenizer(sent);
        while(st.hasMoreTokens())
            if(isCap(st.nextToken())==true)
            ++freq;
        System.out.println("The freq of capital words is:"+freq);
    }
    public static void main()
    {
        capital obj=new capital();
        obj.input();
        obj.display();
    }
}
        
