import java.util.*;
public class Palindrome_Numbers
{
    public static boolean palindrome(int a)
    {
        int rem=0,rev=0,num=a;
        while(a>0)
        {
            rem=a%10;
            a=a/10;
            rev=rev*10+rem;
        }
        if(num==rev)
        {
            System.out.println(num);
            return true;
        }
        else
        {
            return false;
        }
    }
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++)
	        arr[i]=sc.nextInt();
	    for(int i=0;i<n;i++)
	    {
	        for(int j=arr[i]+1;!palindrome(j);j++);
	    }
	}
}