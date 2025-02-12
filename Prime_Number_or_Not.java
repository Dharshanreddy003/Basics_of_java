import java.util.*;
public class Prime_Number_or_Not
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int n=sc.nextInt();
	    if(n<=1)
	        System.out.println("Not a prime number");
	    else{
	        for(int i=2;i<n;i++)
	        {
	            if(n%i==0)
	            {
	                System.out.println("Not a prime number");
	                break;
	            }
	            else if(i==n-1 && n%i !=0)
	                System.out.println("Is a prime number");
	        }
	
	    }
	}
}