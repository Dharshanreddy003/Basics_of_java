public class Swapping_Values_in_Array
{
	public static void main(String[] args) 
	{
	    int arr[]={10,20,5,1,3,2};
	    int n=3;
	    int size=arr.length;
	    while(n>0)
	    {
	        int temp=arr[size-1];
	        for(int i=size-1;i>=0;i--)
	        {
	            if(i>0)
	                arr[i]=arr[i-1];
	            else
	                arr[0]=temp;
	        }
	            for(int j=0;j<size;j++)
	                System.out.print(arr[j]+"\t");
	    System.out.println();  
	    n--;
	    }
	}
}