public class Zeros_to_last
{
	public static void main(String[] args) 
	{
	    int arr[]={1,3,4,5,0,6,7,9,0,5,0,3};
	    int count=0;
	    for(int i=0;i<arr.length;i++)
	    {
	        if(arr[i]==0)
	        {
	            count++;
	            for(int j=i;j<arr.length;j++)
	            {
	                if(j!=arr.length-1)
	                    arr[j]=arr[j+1];
	            }
	        }
	    }
	    int n=arr.length;
	    while(count>0)
	    {
	        arr[n-count]=0;
	        count--;
	    }
	    for(int i=0;i<arr.length;i++)
		    System.out.print(arr[i]);
	}
}