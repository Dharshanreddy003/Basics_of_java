import java.util.*;
public class Problem_4
{
    static boolean abundant(int n)
    {
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
                sum=sum+i;
        }
        if(sum>n)
            return true;
        else 
            return false;
    }
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter number of rows and colums: ");
	    int r=sc.nextInt();
	    int c=sc.nextInt();
	    int arr[][]=new int[r][c];
	    for(int i=0;i<r;i++)
	    {
	        for(int j=0;j<c;j++)
	            arr[i][j]=sc.nextInt();
	    }
	    int count=0;
	    for(int i=0;i<r;i++)
	    {
	        for(int j=0;j<c;j++)
	            if(abundant(arr[i][j]))
	            {
	                System.out.println(arr[i][j]);
	                count++;
	            }
	    }
	    if(count%2==0)
	        System.out.println("Yes");
	    else
	        System.out.println("No");
	    
	}
}