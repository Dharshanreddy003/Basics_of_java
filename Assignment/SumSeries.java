import java.util.Scanner;
public class SumSeries
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=sc.nextInt();
        System.out.print("Enter the number of terms:");
        int x=sc.nextInt();

        int sum=0;
        int term=0;

        for(int i=0;i<x;i++) 
        {
            term=term*10+n;
            sum=sum+term;
        }
        System.out.println("Sum of series:"+sum);
        sc.close();
    }
}
