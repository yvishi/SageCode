package class12;
import java.util.Scanner;
class eq
{
    int a[][];
    int m,n;
    public eq(int mm, int nn)
    {
        m=mm;n=nn;
        a=new int[m][n];
    }

    public void readarray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the data row-wise.");
        for(int i=0;i<m;++i)
            for(int j=0;j<n;++j)
            {
                System.out.print("Enter the number:");
                a[i][j]=sc.nextInt();
            }
    }

    public int check(eq p,eq q)
    {
        for(int i=0;i<m;++i)
            for(int j=0;j<n;++j)
            {
                if(p.a[i][j]==q.a[i][j])
                    continue;
                else
                    return 0;
            }
        return 1;
    }

    public void print()
    {
        for(int i=0;i<m;++i)
        {
            for(int j=0;j<m;++j)
                System.out.print(a[i][j]+"\t");
            System.out.println();
        }
        System.out.println();
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the rows and columns:");
        int mm=sc.nextInt();
        int nn=sc.nextInt();
        eq obj1=new eq(mm,nn);
        eq obj2=new eq(mm,nn);
        obj1.readarray();
        obj2.readarray();
        if(obj1.check(obj1,obj2)==1)
        System.out.println("\nThey are equal matrices");
        else
        System.out.println("\nThey are not equal matrices");
        obj1.print();
        obj2.print();
    }
}
            