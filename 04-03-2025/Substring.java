import java.util.*;
public class Substring
{
    static void string(String str)
    {
        String  str1=str.substring(3,8);
        System.out.println("Substring Extracted from the String : "+str1);
    }
    static void stringBuilder(String str)
    {
        StringBuilder  str1=new StringBuilder(str);
        String str2=str1.substring(2,7);
        System.out.println("Substring Extracted from the String(Using StringBuilder) : "+str2);
    }
    static void stringBuffer(String str)
    {
        StringBuffer  str1=new StringBuffer(str);
        String str2=str1.substring(1,6);
        System.out.println("Substring Extracted from the String(Using StringBuffer) : "+str2);
    }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str=sc.nextLine();
		string(str);
	    stringBuilder(str);
	    stringBuffer(str);
		
	}
}