package class12;

import java.util.Scanner;
class trans
{
    int a[][];
    int m;
    public trans(int mm)
    {
        m=mm;
        a=new int[m][m];
    }

    public void fillarray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the data row-wise.");
        for(int i=0;i<m;++i)
            for(int j=0;j<m;++j)
            {
                System.out.print("Enter the number:");
                a[i][j]=sc.nextInt();
            }
    }

    public void transpose()
    {   
        
        for(int i=0;i<m;++i)
            for(int j=1;j>i&&j<m;++j)
            {    
                int t=a[j][i];
                a[j][i]=a[i][j];
                a[i][j]=t;
            }
        
    }

    public void display()
    {
        System.out.println("\nOriginal matrix:");
        for(int i=0;i<m;++i)
        {
            for(int j=0;j<m;++j)
                System.out.print(a[i][j]+"\t");
            System.out.println();
        }
        transpose();
        System.out.println("\nTransposed matrix:");
        for(int i=0;i<m;++i)
        {
            for(int j=0;j<m;++j)
                System.out.print(a[i][j]+"\t");
            System.out.println();
        }
    }

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the dimension of the array:");
        int mm=sc.nextInt();  
        trans obj=new trans(mm);
        obj.fillarray();
        obj.display();
    }
}
 