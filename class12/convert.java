package class12;

import java.util.Scanner;
class convert
{
    int n,d,m,y;
    public convert()
    {
        n=d=m=y=0;
    }
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the day number and year:");
        n=sc.nextInt();
        y=sc.nextInt();
    }
    public void day_to_date()
    {  
        int a[]={31,28,31,30,31,30,31,31,30,31,30,31};
        if(y%4==0)
        a[1]=29;
        int sum=0;
        for(int i=0;i<12;++i)
        {
            if(sum>=n)
            {
                d=n-(sum-a[i-1]);
                m=i-1;
                break;
            }
            else
            sum+=a[i];
        }
    }
    public void display()
    {
        String mo[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
        System.out.print(mo[m]+" "+d+","+y);
    }
    public static void main()
    {
        convert obj=new convert();
        obj.accept();
        obj.day_to_date();
        obj.display();
    }
}
        
        
        