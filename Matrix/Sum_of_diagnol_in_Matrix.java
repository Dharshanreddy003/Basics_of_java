import java.util.*;
public class Sum_of_diagnol_in_Matrix
{
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
	    for(int i=0;i<r;i++)
	    {
	        for(int j=0;j<c;j++)
	            if(i==j)
	                System.out.print(arr[i][j]+"\t");
	            else
	                System.out.print("\t");
	        System.out.println();
	    }
	    for(int i=0;i<r;i++)
	    {
	        int sum=0;
	        for(int j=0;j<c;j++)
	        {
	            sum+=arr[i][j];
	            if(j==c-1)
	                arr[i][i]=sum;
	        }
	    }
	    
	    for(int i=0;i<r;i++)
	    {
	        for(int j=0;j<c;j++){
	            if(i==j)
	                System.out.print(arr[i][j]);
	            else
	                System.out.print("\t");
	        }
	        System.out.println();
	    }
	    
	    int sum=0;
	    for(int i=0;i<r;i++)
	    {
	        for(int j=0;j<c;j++)
	        {
	            if(i==j && i<=r/2)
	            {
	                while(i!=j)
	                {
	                    sum+=arr[r+1][j];
	                }
	            }
	        }
	    }
	    
	    for(int i=0;i<r;i++)
	    {
	        for(int j=0;j<c;j++)
	            if(i==j)
	                System.out.print(arr[i][j]+"\t");
	            else
	                System.out.print("\t");
	        System.out.println();
	    }
	    
	}
}