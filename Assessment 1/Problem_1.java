import java.util.*;
public class Problem_1
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int r=sc.nextInt();
	    int c=sc.nextInt();
	    int arr[][]=new int[r][c];
	    int max=0,secmax=0,thirdmax=0;
	    for(int i=0;i<r;i++)
	    {
	        for(int j=0;j<c;j++)
	        {
	            arr[i][j]=sc.nextInt();
	        }
	    }
	    
	    for(int i=0;i<r;i++)
	    {
	        for(int j=0;j<c;j++)
	        {
	            for(int l=0;l<r;l++)
	            {
	                for(int k=0;k<c;k++)
	                {
	                   if(arr[i][j]<arr[l][k])
	                        max=arr[l][k];
	                }
	            }
	        }
	    }
	    System.out.println(max);
	    
	    for(int i=0;i<r;i++)
	    {
	        for(int j=0;j<c;j++)
	        {
	            if(arr[i][j]<max && arr[i][j]>secmax && arr[i][j]!=max)
	                secmax=arr[i][j];
	        }
	    }
	    System.out.println(secmax);
	    
	    for(int i=0;i<r;i++)
	    {
	        for(int j=0;j<c;j++)
	        {
	           if(arr[i][j]>thirdmax && arr[i][j]<secmax && arr[i][j]!=secmax)
	                thirdmax=arr[i][j];
	        }
	    }
	    if(thirdmax==0)
	        System.out.println("Invalid Input");
	    else
	        System.out.println(thirdmax);
	}
}