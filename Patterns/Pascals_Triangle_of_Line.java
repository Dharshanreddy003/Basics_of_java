public class Pascals_Triangle_of_Line
{
	public static void main(String[] args) 
	{
	    int n=5;
	    for(int i=n;i>n-1;i--)
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