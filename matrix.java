package class12;


//Program to subtract two matrices


import java.util.Scanner;
class matrix
{
    int a[][];
    int m,n;
    public matrix(int mm,int nn)
    {
        m=mm;n=nn;
        a=new int[m][n];
    }

    public void fillarray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Fill the matrix row-wise.");
        for(int i=0;i<m;++i)
            for(int j=0;j<n;++j)
            {
                System.out.print("Enter the number:");
                a[i][j]=sc.nextInt();
            }
    }

    public matrix submat(matrix a)
    {
        matrix b=new matrix(m,n);
        for(int i=0;i<m;++i)
            for(int j=0;j<n;++j)
                b.a[i][j]=a.a[i][j]-this.a[i][j];
        return b;
    }

    public void display()
    {
        System.out.println("The resultant matrix is:\n");
        for(int i=0;i<m;++i)
        {
            for(int j=0;j<n;++j)
                System.out.print(a[i][j]+"\t");
            System.out.println();
        }
    }

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the rows and columns:");
        int mm=sc.nextInt();
        int nn=sc.nextInt();
        matrix obj1=new matrix(mm,nn);
        matrix obj2=new matrix(mm,nn);
        matrix obj3=new matrix(mm,nn);
        obj1.fillarray();obj2.fillarray();
        obj3=obj1.submat(obj2);
        obj3.display();
    }
}

            
            
            
            
            
            