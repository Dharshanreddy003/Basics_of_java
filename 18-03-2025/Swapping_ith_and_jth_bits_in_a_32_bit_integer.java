import java.util.*;
public class Swapping_ith_and_jth_bits_in_a_32_bit_integer
{
    static String binary(int a)
    {
        String str="";
        int count=0;
		while(a>0)
		{
			int rem=a%2;
			a/=2;
			str=rem+""+str;
			count++;
		}
		int i=32;
		while(i>count)
		{
		    str="0"+str;
		    i--;
		}
		return str;
    }
    static String swap(String a,int i,int j)
    {
        char arr[]=a.toCharArray();
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        a="";
        for(int k=0;k<arr.length;k++)
            a+=arr[k];
        return a;
    }
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int i=sc.nextInt();
	    int j=sc.nextInt();
	    String str=swap(binary(n),i-1,j-1);
	    System.out.println(binary(n)+"\n"+str);
		
	}
}