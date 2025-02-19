import java.util.*;
public class Get_and_Display_Matrix
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
	            System.out.print(arr[i][j]+"\t");
	        System.out.println();
	    }
	}
}