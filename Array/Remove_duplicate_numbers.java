public class Remove_duplicate_numbers
{
	public static void main(String[] args)
	{
	    int arr[]={3,2,3,1,2,9};
	    for(int i=0;i<arr.length-1;i++)
	    {
	        for(int j=1;j<arr.length;j++)
	        {
	            if(i!=j && arr[i]==arr[j])
	                arr[j]=-1;
	        }
	    }
	    for(int i=0;i<arr.length;i++)
	    {
	        if(arr[i]!=-1)
	            System.out.print(arr[i]);
	    }
	}
}