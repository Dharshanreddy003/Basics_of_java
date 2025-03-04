import java.util.*;
public class Palindrome
{ 
    static boolean string(String str)
    {
        String str1="";
        for(int i=0;i<str.length();i++)
        str1=str1+str.charAt(i);
        if(str.equals(str1))
            return true;
        else
            return false;
    }
    
    static boolean stringbuilder(String str)
    {
        StringBuilder  str1=new StringBuilder(str);
        str1=str1.reverse();
        if(str.equals(str1.toString()))
            return true;
        else
            return false;
    }
    
    static boolean stringbuffer(String str)
    {
        StringBuffer  str1=new StringBuffer(str);
        str1=str1.reverse();
        if(str.equals(str1.toString()))
            return true;
        else
            return false;
    }
    static boolean without(String str)
    {
        int n=str.length();
        boolean istrue=true;
        for(int i=0;i<(n/2)-1;i++)
        {
            if(str.charAt(i)!=str.charAt(n-i-1))
            {
                istrue=false;
                break;
            }
        }
        return istrue;
    }
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String to Check Palindrome or Not : ");
		String str=sc.next();
		System.out.println(str+" is a palindrome(using String Builtin Method) : "+string(str));
		System.out.println(str+" is a palindrome(using StringBuilder Builtin Method) : "+stringbuilder(str));
		System.out.println(str+" is a palindrome(using StringBuffer Builtin Method) : "+stringbuffer(str));
		System.out.println(str+" is a palindrome(without Builtin Method) : "+without(str));
	}
}