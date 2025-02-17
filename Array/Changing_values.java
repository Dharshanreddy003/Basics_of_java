public class Changing_values
{
	public static void main(String[] args) 
	{
	    int arr[]={1,2,3,4,5,6};
	    
	    for(int i:arr)
	    {
	        i++;
		    System.out.println(i);
	    }
	    
	    for(int j=0;j<arr.length;j++)
		    System.out.println(arr[j]);
	    
	    for(int i=0;i<arr.length;i++)
	    {
		    arr[i]++;
		    System.out.println(arr[i]);
		}
		

		for(int j=0;j<arr.length;j++)
		    System.out.println(arr[j]);
		    
	}
}