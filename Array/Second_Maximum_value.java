public class Second_Maximum_value
{
	public static void main(String[] args) 
	{
	    int arr[]={1,2,3,4,5};
	    int max=arr[0],secmax=arr[0];
	    for(int i=0;i<arr.length;i++)
	    {
	        if(arr[i]>max)
	            max=arr[i];
	    }
	    for(int j=0;j<arr.length;j++)
	    {
	        if(arr[j]>secmax && arr[j]<max)
	            secmax=arr[j];
	    }
	    System.out.println(secmax);
	}
}