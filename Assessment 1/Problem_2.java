import java.util.*;
public class Problem_2
{
    public static void sort(int arr[][], int r,int c)
    {
        for(int i=0;i<r;i++)
	    {
	        for(int j=0;j<c;j++)
	        {
	            for(int l=0;l<r;l++)
	            {
	                for(int k=0;k<c;k++)
	                {
	                   if(arr[i][j]<arr[l][k])
	                   {
	                       int temp=arr[i][j];
	                       arr[i][j]=arr[l][k];
	                       arr[l][k]=temp;
	                   }
	                }   
	            }   
	        }
        }
    }
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter number of rows and colums: ");
	    int r=sc.nextInt();
	    int c=sc.nextInt();
	    int arr[][]=new int[r][c];
	    System.out.println("Enter the Values of Matrix: ");
	    for(int i=0;i<r;i++)
	    {
	        for(int j=0;j<c;j++)
	            arr[i][j]=sc.nextInt();
	    }
	    
	    sort(arr,r,c);
	    for(int i=0;i<r;i++)
	    {
	        for(int j=0;j<c;j++)
	            System.out.print(arr[i][j]+"\t");
	        System.out.println();
	    }
	}
}