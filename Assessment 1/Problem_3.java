import java.util.*;
public class Problem_3
{
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
	    for(int i=0;i<r;i++)
	    {
	        for(int j=0;j<c;j++)
	            if(i>=(r/2)-1+i && j<=(c/2)-1+j)
	                arr[j][i]=arr[i][j];
	    }
	    for(int i=0;i<r;i++)
	    {
	        for(int j=0;j<c;j++)
	            System.out.print(arr[i][j]+"\t");
	        System.out.println();
	    }
	}
	
}