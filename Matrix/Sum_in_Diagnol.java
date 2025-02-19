import java.util.*;
public class Sum_in_Diagnol
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
	        {
	            if(i==j && i<r/2)
	            {
	                int x=i+1,y=j,sum=0;
	                while(x<r-i-1)
	                {
	                    sum+=arr[x][j];
	                    x++;
	                }
	                while(y<c-j-1)
	                {
	                    sum+=arr[r-i-1][y];
	                    y++;
	                }
	                if(sum!=0)
	                    arr[i][j]=sum;
	            }
	            else if(i==j && i>=r/2)
	            {
	                int sum=0,x=i-1,y=j-1;
	                while(x>=r-i-1)
	                {
	                    sum+=arr[x][j];
	                    x--;
	                } 
	                while(y>c-j-1)
	                {
	                    sum+=arr[r-i-1][y];
	                    y--;
	                }
	                if(sum!=0)
	                    arr[i][j]=sum;
	            }
	        }
	    }
	    for(int i=0;i<r;i++)
	    {
	        for(int j=0;j<c;j++){
	                System.out.print(arr[i][j]+"\t");
	        }
	        System.out.println();
	    }
    }
}