package class12;

import java.util.Scanner;
class matrev
{
    int arr[][];
    int m,n;
    public matrev(int mm,int nn)
    {
        m=mm;n=nn;
        arr=new int[m][n];
    }
    public void fillarray()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<m;++i)
        for(int j=0;j<n;++j)
        {
            System.out.print("Enter the number:");
            arr[i][j]=sc.nextInt();
        }
    }
    public int rev(int x)
    {
        int rev=0;
        while(x!=0)
        {
            rev=rev*10+(x%10);
            x/=10;
        }
        return rev;
    }
    public void revmat(matrev p)
    {
        for(int i=0;i<m;++i)
        for(int j=0;j<n;++j)
        this.arr[i][j]=rev(p.arr[i][j]);
    }
    public void show()
    {
        for(int i=0;i<m;++i)
        {
            for(int j=0;j<n;++j)
            System.out.print(this.arr[i][j]+"\t");
            System.out.println();
        }
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the rows and columns:");
        int mm=sc.nextInt();int nn=sc.nextInt();
        matrev obj1=new matrev(mm,nn);
        matrev obj2=new matrev(mm,nn);
        obj1.fillarray();
        obj2.revmat(obj1);
        obj2.show();
    }
}
        
           
    
            