import java.util.*;
public class Selection_Sort
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++)
	        arr[i]=sc.nextInt();
	    int max=arr[0];
	    for(int i=0;i<n;i++)
	    {
	        for(int j=i;j<n;j++)
	        {
	           int temp=arr[i];
	           if(arr[j]<arr[i])
	           {
	               arr[i]=arr[j];
	               arr[j]=temp;
	           }
	        }
	    }
	    for(int i=0;i<n;i++)
		    System.out.print(arr[i]);
	}
}