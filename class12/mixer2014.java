package class12;
import java.util.Scanner;
class mixer2014
{
    int arr[];
    int n;
    public mixer2014(int nn)
    {
        n=nn;
        this.arr=new int[n];
    }

    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of array in ascending order without duplicate:");
        for(int i=0;i<n;++i)
        {
            System.out.print("Enter the number:");
            arr[i]=sc.nextInt();
        }
    }

    public mixer2014 mix(mixer2014 A)
    {
        mixer2014 obj=new mixer2014(2*n);
        int k=0; 
        for(int i=0;i<n;++i)
            obj.arr[k++]=this.arr[i];
        for(int j=0;j<n;++j)   
            obj.arr[k++]=A.arr[j];
        return obj;
    }

    public void display()
    {
        System.out.println("The mixed array is:");
        for(int i=0;i<n;++i)
            System.out.println(this.arr[i]);
    }

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the arrays:");
        int nn=sc.nextInt();
        mixer2014 obj1=new mixer2014(nn);
        mixer2014 obj2=new mixer2014(nn);
        mixer2014 obj3=new mixer2014(2*nn);
        obj1.accept();
        obj2.accept();
        obj3=obj1.mix(obj2);
        obj3.display();
    }
}
        
        
                
