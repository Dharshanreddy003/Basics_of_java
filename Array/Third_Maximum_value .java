import java.util.*;
public class Third_Maximum_value
{
	public static void main(String[] args) 
	{
	    int arr[]={1,2,3,4,5};
	    int max=arr[0],secmax=arr[0],thirdmax=arr[0],sec=0;
	    for(int i=0;i<arr.length;i++)
	    {
	        if(arr[i]>max)
	            max=arr[i];
	    }
	    System.out.println(max);
	    
	    for(int j=0;j<arr.length;j++)
	    {
	        if(arr[j]>secmax && arr[j]<max)
	            secmax=arr[j];
	    }
	    System.out.println(secmax);
	    
	     for(int i=0;i<arr.length;i++)
	    {
	        if(max<arr[i])
	            sec=max;
	            max=arr[i];
	    }
	    System.out.println(sec);
	    
	    
	    for(int k=0;k<arr.length;k++)
	    {
	        if(arr[k]>thirdmax && arr[k]<secmax)
	            thirdmax=arr[k];
	    }
	    System.out.println(thirdmax);
	    
	    Arrays.sort(arr);
	    int last=arr.length-1;
	    
	    System.out.println(arr[last-2]);
	}
}