package hg;
import java.util.Scanner;
class MTA
{public static void main()
    {Scanner sc=new Scanner(System.in);
        System.out.println("Hi!What is your name?");
        String n=sc.nextLine();
        System.out.println("Hello,"+n+",I am MTA a Multitasking App.");
        System.out.println("I can perform various functions.The different categories are:-"+"\n"+"\n"+"1.Concerning Mathematics like:-"+"\n"+"(a)Calculating area of circle,triangle,square & rectangle."+"\n"+"(b)Calculating Compound Interest."+"\n"+"(c)Calculating Simple Interest."+"\n"+"(d)A four function calculator."+"\n"+"(e)Calculating the factorial of a number."+"\n"+"(f)Finding whether an integer is prime or composite."+"\n"+"(g)To check whether a number is armstrong or not.");
        System.out.println("\n"+"2.Concerning Money like:-"+"\n"+"(h)Calculating bicycle rental for Yash rental services."+"\n"+"(i)Calculating your total salary(forYash.Inc).");
        System.out.println("\n"+"3.Concerning Voting like:-"+"\n"+"(j)Finding out if you are Eligible to vote."+"\n"+"(k)Creating a voter id.");
        System.out.println("\n"+"4.Concerning conversions like:-"+"\n"+"(l)Coverting time in seconds to hours,minutes & seconds."+"\n"+"(m)Converting height in inches to feet and inches."+"\n"+"(n)Converting money in Rupees to USD,Euro or Yen.");
        System.out.println("\n"+"(Please press the letter given in the bracket at the beginning of an option to perform the task. Enter 0 to exit the system)");
        while(true)
        {
        char ch=sc.next().charAt(0);
        switch(ch)
        {   case '0':break;
           
            case'a':System.out.println("Type1->For area of Circle."+"\n"+"Type2->For area of Triangle."+"\n"+"Type3->For area of Square."+"\n"+"Type4->For area of Rectangle.");
                 int x=sc.nextInt();
                 switch(x)
                 {case 1:System.out.print("Enter the radius:");
                         double r=sc.nextDouble();
                         double a=3.14*r*r;
                         System.out.println("The area of circle is:"+a);
                         break;
                  case 2:System.out.print("Enter the base of triangle:");
                         double b=sc.nextDouble();
                         System.out.print("Enter the height of the triangle:");
                         double h=sc.nextDouble();
                         double aa=0.5*b*h;
                         System.out.println("The area of triangle is:"+aa);
                         break;
                  case 3:System.out.print("Enter the side of the square:");
                         double s=sc.nextDouble();
                         double aaa=s*s;
                         System.out.println("The area of square is:"+aaa);
                         break;
                  case 4:System.out.print("Enter the length:");
                         double Le=sc.nextDouble();
                         System.out.print("Enter the breadth:");
                         double Br=sc.nextDouble();
                         double a2=Le*Br;
                         System.out.println("The area of the Rectangle is:"+a2);
                         break;
                 default:System.out.println("Are you OK");
                }
                break;
        case'b':System.out.print("Enter the principle amount:");
                double p=sc.nextDouble();
                System.out.print("Enter the rate of interest:");
                double r=sc.nextDouble();
                System.out.print("Enter the time:");
                double t=sc.nextDouble();
                System.out.println("If you are calculating CI compounded half yearly press H if compounded anually press A:");
                char cho=sc.next().charAt(0);
                switch(cho)
                {case 'A':
                 case 'a':double c=p*Math.pow((r/100+1),t);
                          System.out.println("The CI is:"+c);
                          break;
                  case'H':
                  case'h':c=p*Math.pow((r/200+1),(t/2));
                          System.out.println("The CI is:"+c);
                          break;
                  default:System.out.println("Please choose one of the options.");
                }
                break;
        case'c':System.out.print("Enter the principle amount:");
                double P=sc.nextDouble();
                System.out.print("Enter the rate of interest:");
                double R=sc.nextDouble();
                System.out.print("Enter the time:");
                double T=sc.nextDouble();
                double si=(P*R*T)/100;
                System.out.println("The simple interest is:"+si);
                break;
        case'd':System.out.print("Type1 for addition,Type2 for subtraction,Type3 for multiplication,Type4 for division &Type5 for exit");
                int che=sc.nextInt();
                System.out.print("Enter the first number:");
                double a=sc.nextDouble();
                System.out.print("Enter the second number:");
                double b=sc.nextDouble();
                switch(che)
                { case 1:double c=a+b;
                         System.out.println("The addition of the numbers is:"+c);
                         break;
                  case 2:c=a-b;
                         System.out.println("The subtraction of the numbers is:"+c);
                         break;
                  case 3:c=a*b;
                         System.out.println("The multiplication of the numbers is:"+c);
                         break;
                  case 4:if(b==0)
                         System.out.println("Anything divided by 0 is zero");
                         else
                         {c=a/b;
                          System.out.println("The division of the two numbers is:"+c);}
                         break;
                  case 5:break;        
                 default:System.out.println("Are you OK!");
                }        
                break;
        case'h':System.out.print("Enter no of days bicycle rented:");
                int d=sc.nextInt();
                System.out.println("Name:"+n+"\n"+"Days of rental:"+d);
                if(d>0&&d<=2)
                System.out.println("Rent is:Rs"+(50*d));
                else if(d>2&&d<=5)
                System.out.println("Rent is:Rs"+(40*(d-2)+100));
                else if(d>5&&d<=10)
                System.out.println("Rent is:Rs"+(30*(d-5)+100+120));
                else
                System.out.println("Rent is:Rs"+(20*(d-10)+100+120+150));  
                break;
        case'i':System.out.print("Enter employee number:");
                int e=sc.nextInt();
                System.out.print("Enter basic pay:");
                double B=sc.nextDouble();
                double D=0.4*B;
                double h=0.25*B;
                double g=B+D+h;
                double i=0.1*g;
                double To=g-i;
                System.out.println("\n"+"Employee number:"+e+"\n"+"Name:"+n+"\n"+"Gross pay:"+g+"\n"+"Net salary(Total salary):"+To);
                break;
        case'j':System.out.print("If you are a citizen of India press Y and if not press N:");
                char chi=sc.next().charAt(0);
                switch(chi)
                {case 'N':
                 case 'n':System.out.println("You are not eligible to vote.");
                          break;
                 case 'Y':
                 case 'y':System.out.print("Enter your age:");
                          int ag=sc.nextInt();
                          if(ag>=18)
                          {
                           System.out.print("If you are disqualified to vote under any law stated in the Constitution of India press Y if not press N:");
                           char c=sc.next().charAt(0);
                           switch(c)
                           {case 'Y':
                            case 'y':System.out.println("You are not eligible to vote.");
                                     break;
                            case 'N':
                            case 'n':System.out.println("\n"+n+",age,"+ag+", is a citizen of India and not disqualified under any law and therefor is ELIGIBLE to vote.");
                                     break;
                             default:System.out.println("Please choose one of the options.");
                           }
                          }
                          else
                          System.out.println("You are not eligible to vote.");
                          break;
                  default:System.out.println("Please choose one of the options.");
                }
                break;
        case'k':System.out.print("Enter you voter number:");
                int v=Integer.parseInt(sc.next());
                System.out.print("Enter your address:");
                String ad=sc.nextLine();
                System.out.print("Enter your age:");
                int ag=Integer.parseInt(sc.next());
                System.out.println("\n"+"VOTER'S ID"+"\n"+"Voter's name:"+n+"\n"+"Voter number:"+v+"\n"+"Age:"+ag+"\n"+"Address:"+ad);
                break;
        case'l':System.out.print("Enter time in sconds:");
                double sec=sc.nextDouble();
                double Ho=sec/3600;
                      sec=sec%3600;
                double Mi=sec/60;
                      sec=sec%60;
                System.out.println("Hours:"+Ho+"\n"+"Minutes:"+Mi+"\n"+"Seconds:"+sec);
                break;
        case'm':System.out.print("Enter height in inches:");
                double In=sc.nextDouble();
                double Fe=In/12;
                       In=In%12;
                System.out.println("Feet:"+Fe+"\n"+"Inches:"+In);
                break;
        case'n':System.out.println("Enter the amount in Rupees(INR):");
                double Ru=sc.nextDouble();
                System.out.println("Type1 to convert into Dollars(USD),Type2 to convert into Euro,Type3 to convert into Yen,Type4 to Exit:");
                int cha=sc.nextInt();
                switch(cha)
                { case 1:double u=Ru/72.90;
                         System.out.println("The amount in USD is:"+u);
                         break;
                  case 2:double E=Ru/89.47;
                         System.out.println("The amount in Euro is:"+E);
                         break;
                  case 3:double y=Ru/0.71;
                         System.out.println("The amount in Yen is:"+y);
                         break;
                  case 4:break;
                 default:System.out.println("Please choose one of the options.");
                }
                break;
        case'e':System.out.print("Enter the Integer:");
                int Fa=sc.nextInt();
                int FA=1;
                for(int L=1;L<=Fa;++L)
                { 
                    FA=FA*L;
                }
                System.out.println("The factorial of "+Fa+" is:"+FA);
                break;
        case'f':System.out.println("Enter the number:");
                int Nm=sc.nextInt();
                if(Nm==1)
                System.out.println("1 is neither prime nor composite.");
                else
                {int count=0;
                 for(int K=1;K<=Nm;++K)
                 { if(Nm% K==0)
                     ++count;
                   else
                   continue;
                }
                if(count==2)
                System.out.println(Nm+" is a prime number.");
                else
                System.out.println(Nm+" is a composite number.");
               }
               break;
        case'g':System.out.print("Enter the number:");
                int num=sc.nextInt();
                int Num=num;
                int sum=0;
                while(num!=0)
                { int Den=num%10;
                  Den=Den*Den*Den;
                  sum+=Den;
                  num/=10;
                }
                if(Num==sum)
                System.out.println("The number is an Armstrong number.");
                else
                System.out.println("The number is not an Armstrong number");
                break;
        default:System.out.println("Please choose one of the options.I will soon be able to perform more tasks.");
       }
       if(ch=='0')
       {
         break;
       }
       else
       {
         System.out.println("You can select another option or enter 0 to exit:");  
       }
     }
      System.out.println("\n"+"Thank-You");
     }
} 