 package class12;
import java.util.Scanner;
class adder
{
    int a[];
    public adder()
    {
        a=new int[2];
        a[0]=0;
        a[1]=0;
    }
    public void readtime()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the hours:");
        a[0]=sc.nextInt();
        System.out.print("Enter the minutes:");
        a[1]=sc.nextInt();
    }
    public void addtime(adder x, adder y)
    {
        this.a[1]=(x.a[1]+y.a[1])%60;
        this.a[0]=x.a[0]+y.a[0]+((x.a[1]+y.a[1])/60);
    }
    public void disp()
    {
        System.out.println("Hours are:"+this.a[0]);
        System.out.println("Minutes are:"+this.a[1]);
    }
    public static void main()
    {
        adder obj1=new adder();
        adder obj2=new adder();
        adder obj3=new adder();
        obj1.readtime();
        obj2.readtime();
        obj3.addtime(obj1,obj2);
        obj3.disp();
    }
}