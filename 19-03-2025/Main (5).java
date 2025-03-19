import java.util.*;
public class Main
{
    static void spiralorder(int[][] matrix,int r,int c)
    {
        int i=0,j=0,k=0,l=0;
        if(i<=k && j<=l)
        {
            while(j<c)
            {
                System.out.print(matrix[i][j]+"\t");
                j++;
            }
            i++;
            while(i<r)
            {
                System.out.print(matrix[i][j-1]+"\t");
                i++;
            }
            j-=2;
            while(j>l)
            {
                System.out.print(matrix[i-1][j]+"\t");
                j--;
            }
            l--;
            i--;
            while(i>k)
            {
                System.out.print(matrix[i][j]+"\t");
                i--;
            }
            k++;
            j++;
        }
    }
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter the row and column value: ");
	    int r=sc.nextInt();
	    int c=sc.nextInt();
	    int matrix[][]=new int[r][c];
	    System.out.println("Enter the matrix values :");
	    for(int i=0;i<r;i++)
	    {
	        for(int j=0;j<c;j++)
	        {
	            matrix[i][j]=sc.nextInt();
	        }
	    }
	    spiralorder(matrix,r,c);
	}
}