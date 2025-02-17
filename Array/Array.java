public class Array
{
	public static void main(String[] args) 
	{
	    int arr[]={1,2,3,4,5,6};
	    for(int i:arr)
		    System.out.println(i);
		for(int i=0;i<arr.length;i++)
		    System.out.println(arr[i]);
		for(int j=arr.length-1;j>=0;j--)
		    System.out.println(arr[j]);
	}
}