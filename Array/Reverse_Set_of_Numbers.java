public class Reverse_Set_of_Numbers
{
	public static void main(String[] args) 
	{
	    int arr[]={1,2,3,4,5,6};
	    int n=3;
	    for(int i=1;i<arr.length;i++)
	    {
	        int a=n*i;
	        if(a<=arr.length)
	        {
	            for(int j=a-1;j>=a-n;j--)
	            {
	                System.out.print(arr[j]);
	            }
	        }
	        else
	        {
	            while(a>arr.length-1)
	                a--;
	        }
	    }
	}
}