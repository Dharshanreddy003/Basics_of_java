public class Sum_of_two_Arrays
{
	public static void main(String[] args) 
	{
	    int arr1[]={5,1,3};
	    int arr2[]={9,7,7,7};
	    int carry=0,sum=0,digit=0,a=0,b=0;
	    int n=arr1.length>arr2.length?arr1.length:arr2.length;
	    for(int i=0;i<n;i++)
	    {
	        if(i>=arr1.length)
	            a=0;
	        else
	            a=arr1[i];
	        if(i>=arr2.length)
	            b=0;
	        else
	            b=arr2[i];
	        sum=a+b;
	        digit=sum%10;
	        if(carry==0)
	            System.out.print(digit);
	        else
	        {
	            sum=sum+carry;
	            digit=sum%10;
	            System.out.print(digit);
	        }
	        carry=sum/10;
	    }
	    if(carry>0)
	        System.out.print(carry);
	}
}