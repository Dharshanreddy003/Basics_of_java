import java.util.*;
public class Clockwise_and_CounterClockwise
{
    public static void clockwise(int[][] matrix,int n)
    {
        int matrix1[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix1[i][j]=matrix[j][i];
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n/2;j++)
            {
                int temp=matrix1[i][j];
                matrix1[i][j]=matrix1[i][n-j-1];
                matrix1[i][n-j-1]=temp;
            }
        }
        for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<n;j++)
	        {
	            System.out.print(matrix1[i][j]+"\t");
	        }
	        System.out.println();
	    }
	    System.out.println("antiClockWise Matrix :");
	    anticlockwise(matrix1,n);
    }
    public static void anticlockwise(int[][] matrix,int n)
    {
        int matrix1[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix1[i][j]=matrix[j][i];
            }
        }
        for(int i=0;i<n/2;i++)
        {
            for(int j=0;j<n;j++)
            {
                int temp=matrix1[i][j];
                matrix1[i][j]=matrix1[n-i-1][j];
                matrix1[n-i-1][j]=temp;
            }
        }
        for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<n;j++)
	        {
	            System.out.print(matrix1[i][j]+"\t");
	        }
	        System.out.println();
	    }
    }
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter the n value: ");
	    int n=sc.nextInt();
	    int matrix[][]=new int[n][n];
	    System.out.println("Enter the matrix values :");
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<n;j++)
	        {
	            matrix[i][j]=sc.nextInt();
	        }
	    }
	    System.out.println("ClockWise Matrix :");
	    clockwise(matrix,n);
	}
}