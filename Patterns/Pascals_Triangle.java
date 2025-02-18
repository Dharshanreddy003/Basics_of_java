public class Pascals_Triangle
{
	public static void main(String[] args) 
	{
	    int n=6;
	    for(int i=0;i<n;i++)
	    {
	        int num=1;
	        for(int j=n-i-1;j>0;j--)
	            System.out.print(" ");
	        for(int k=0;k<=i;k++)
	        {
	            System.out.print(num+" ");
	            num=num*(i-k)/(k+1);
	        }
	        System.out.print("\n");
	    }
	}
}