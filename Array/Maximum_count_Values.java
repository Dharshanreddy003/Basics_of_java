public class Maximum_count_Values
{
	public static void main(String[] args) 
	{
	    int arr[]={1,1,0,1,1,0,0,1,0,1,1,1,0};
	    int count=0,maxcount=0;
	    for(int i=0;i<arr.length;i++)
	    {
	        if(arr[i]==1)
	        {
	            count++;
	            if(count>maxcount)
	                maxcount=count;
	        }
	        else
	            count=0;
	    }
		System.out.println(maxcount);
	}
}