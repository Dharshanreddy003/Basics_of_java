import java.util.*;
public class Palindrome_Letters
{
    public static void palindrome(String str)
    {
        int n=str.length(); boolean check=false;
        for(int i=0;i<=n/2;i++)
        {
            if(i<=n/2)
            {
                if(str.charAt(i)==str.charAt(n-i-1))
                    check=true;
                else
                    check=false;
            }
            else 
                break;
        }
        if(check)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    String n=sc.next();
	    palindrome(n);
	}
}