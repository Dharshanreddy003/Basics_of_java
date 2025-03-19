import java.util.*;
public class Clockwise_SpiralOrder
{
    public static void swap(int a[][], int r, int c)
    {
    int row=0, col=0, curr=0, prev=0;
	    while(row<r && col<c)
	    {
	        if(row+1==r || col+1==c)
	            break;
	        prev=a[row+1][col];
	        for(int i=col;i<c;i++)
	        {
	            curr=a[row][i];
	            a[row][i]=prev;
	            prev=curr;
	        }
	        row++;
	        for(int i=row;i<r;i++)
	        {
	            curr=a[i][c-1];
	            a[i][c-1]=prev;
	            prev=curr;
	        }
	        c--;
	        if(row<r)
	        {
	            for(int i=c-1;i>=col;i--)
	            {
	                curr=a[r-1][i];
	                a[r-1][i]=prev;
	                prev=curr;
	            }
	            r--;
	        }
	        if(col<c)
	        {
	            for(int i=r-1;i>=row;i--)
	            {
	                curr=a[i][col];
	                a[i][col]=prev;
	                prev=curr;
	            }
	        }
	        col++;
	    }
		
    }	
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter number of rows and colums: ");
	    int r=sc.nextInt();
	    int c=sc.nextInt();
	    int a[][]=new int[r][c];
	    System.out.println("Enter the Values of Matrix: ");
	    for(int i=0;i<r;i++)
	    {
	        for(int j=0;j<c;j++)
	            a[i][j]=sc.nextInt();
	    }
	    swap(a,r,c);
	    for(int i=0;i<r;i++)
	    {
	        for(int j=0;j<c;j++)
	            System.out.print(a[i][j]+"\t");
	        System.out.println();
	    }
	}
}