import java.util.*;
public class Sum_of_Digits
{
    static boolean evensum(int n)
    {
        if(n%2==0)
            return true;
        else
            return false;
    }
    static boolean oddsum(int n)
    {
        if(n%2!=0)
            return true;
        else 
            return false;
    }
    static boolean primesum(int n)
    {
        boolean isprime=false;
        if(n==2)
            isprime=true;
        else{
            for(int i=2;i<n;i++)
            {
                isprime=false;
                if(n%i==0)
                {
                    isprime=false;
                    break;
                }
                else{
                    isprime=true;
                }
            }
        }
        if(isprime)
            return true;
        else
            return false;
    }
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int num=sc.nextInt();
	    Sum_of_Digits o=new Sum_of_Digits();
	    int rem,esum=0,osum=0,psum=0;
	    while(num>0)
	    {
	        rem=num%10;
	        if(o.evensum(rem))
	            esum+=rem;
	        if(o.oddsum(rem))
	            osum+=rem;
	        if(o.primesum(rem))
	            psum+=rem;
	        num/=10;
	    }
		System.out.println(esum);
		System.out.println(osum);
		System.out.println(psum);
	}
}