package class12;

import java.util.Scanner;
class salpha
{
    String sent;
    int n;
    public salpha()
    {
        sent="";
        n=0;
    }
    public void input()
    {
        Scanner sc=newScanner(System.in);
        System.out.print("Enter the sentence in uppercase:");
        sent=sc.nextLine();
        