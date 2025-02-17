public class Maxones_front
{
	public static void main(String[] args) 
	{
	    int arr[]={1,1,0,1,1,0,1,1,0,1};
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